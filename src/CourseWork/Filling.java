package CourseWork;

import java.util.ArrayDeque;

class Filling {
    //Желаемый объём
    private int desVolume;
    //вёдра с заданным объёмом
    Bucket one = new Bucket();
    Bucket two = new Bucket();
    Bucket three = new Bucket();
    //несуществующее ведро, представляющее собой результат переливания из 2 ведра в 3е
    Bucket difference = new Bucket(Math.abs(two.getVolume() - three.getVolume()));
    boolean success = false;
    ArrayDeque<Integer> result = new ArrayDeque<>();

    //запоминаем последовательность ходов
    private void resSuccess(ArrayDeque<Integer> res) {
        this.result = res.clone();
    }

    //если достигли нужного объёма
    private void trueSuccess() {
        this.success = true;
    }

    //for testing purposes(start)
    Filling(int volumeOne, int volumeTwo, int volumeThree) {
        this.one = new Bucket(volumeOne);
        this.two = new Bucket(volumeTwo);
        this.three = new Bucket(volumeThree);
        this.difference = new Bucket(Math.abs(two.getVolume() - three.getVolume()));
    }

    void setDesVolume(int volume) {
        desVolume = volume;
    }
    //for testing purposes (end)


    int getDesVolume() {
        return this.desVolume;
    }

    //для тестирования
    void recFill() {
        //если ещё не нашли решения
        if (!success) {
            //если объём уже найден
            if (this.one.getVolume() == this.getDesVolume()) {
                trueSuccess();
                return;
            }
            //если можем вылить объём второго ведра и не сделать меньше желаемого
            if (this.one.getVolume() - this.two.getVolume() >= this.getDesVolume()) {
                this.one.refill(two);
                //используем поиск с возвратом
                recFill();
                this.one.nowVolume += this.two.getVolume();
            }
            //если можем вылить объём третьего ведра и не сделать меньше желаемого
            if (this.one.getVolume() - this.three.getVolume() >= this.getDesVolume()) {
                this.one.refill(three);
                recFill();
                this.one.nowVolume += this.three.getVolume();
            }
            //если можем вылить из основного ведра объём равный разнице между
            //вторым и третьим и не сделать меньше желаемого
            if (this.one.getVolume() - this.difference.getVolume() >= this.getDesVolume()) {
                this.one.refill(difference);
                recFill();
                this.one.nowVolume += this.difference.getVolume();
            }
        }

    }

    void recFill(ArrayDeque<Integer> res) {
        //если ещё не нашли решения
        if (!success) {
            //если объём уже найден
            if (this.one.getVolume() == this.getDesVolume()) {
                trueSuccess();
                //запоминаем результат
                resSuccess(res);
                return;
            }
            //если можем вылить объём второго ведра и не сделать меньше желаемого
            if (this.one.getVolume() - this.two.getVolume() >= this.getDesVolume()) {
                this.one.refill(two);
                //используем мемоизацию
                res.add(two.getVolume());
                //используем поиск с возвратом
                recFill(res);
                this.one.nowVolume += this.two.getVolume();
                res.removeLast();
            }
            //если можем вылить объём третьего ведра и не сделать меньше желаемого
            if (this.one.getVolume() - this.three.getVolume() >= this.getDesVolume()) {
                this.one.refill(three);
                res.add(three.getVolume());
                recFill(res);
                this.one.nowVolume += this.three.getVolume();
                res.removeLast();
            }
            //если можем вылить из основного ведра объём равный разнице между
            //вторым и третьим и не сделать меньше желаемого
            if (this.one.getVolume() - this.difference.getVolume() >= this.getDesVolume()) {
                this.one.refill(difference);
                res.add(difference.getVolume());
                recFill(res);
                this.one.nowVolume += this.difference.getVolume();
                res.removeLast();
            }
        }
    }

}


package CourseWork;

class Bucket {

    //объём ведра
    int nowVolume;
    int maxVolume;

    //задаём объёмы вёдер
    Bucket(int volume) {
        nowVolume = volume;
        maxVolume = volume;
    }

    //for testing purposes
    Bucket() {
    }

    //процедура выливания воды
    void refill(Bucket b) {
        int temp = this.nowVolume - b.nowVolume;
        if (temp >= 0)
            this.nowVolume = temp;
    }

    //получить текущий объём воды в ведре
    int getVolume() {
        return nowVolume;
    }


}

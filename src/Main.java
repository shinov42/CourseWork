public class Main {
    public static void main(String[] args){
        Filling buck = new Filling();
        buck.setDesVol();
       int diff = buck.one.getVolume() - buck.getDesVolume();
       if (diff / buck.two.getVolume() == 0)
           while (buck.one.getVolume() != buck.getDesVolume())
               buck.one.refill(buck.two);
           //выливаем по ведру пока не достигнем нужного объёма
       else if(diff/buck.three.getVolume() == 0)
           while (buck.one.getVolume() != buck.getDesVolume())
                buck.one.refill(buck.three);
           //то же самое
       else if(diff/buck.difference.getVolume() == 0)
           while (buck.one.getVolume() != buck.getDesVolume())
               buck.one.refill(buck.difference);
           //выливаем во 2, из него в 3 и обратно в начальное - получаем разницу. Записать как одно - несколько ходов в одном
       else
           buck.recFill();
           ;//идём в лоб и рекурсия
        // TODO: 22.11.2017 Добавлять в список успешные ходы, а затем вывеести поседовательность. При рекурсии можно удалять ходы из этого списка
    }

}

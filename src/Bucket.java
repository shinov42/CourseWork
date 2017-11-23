public class Bucket {

    private boolean refilled;
    private int maxVolume = 0;
    private int nowVolume = 0;

    Bucket(/*boolean check,*/ int volume){
//        refilled = check;
        maxVolume = volume;
        nowVolume = volume;
    }

    public void refill(Bucket b){
       int temp = this.nowVolume - b.nowVolume;
        if (temp >= 0)
            this.nowVolume = temp;
    }

    public int getVolume(){
        return maxVolume;
    }


}

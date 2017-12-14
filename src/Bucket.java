public class Bucket {

    public int nowVolume = 0;

    Bucket(int volume) {
        nowVolume = volume;
    }

    //for testing purposes
    Bucket() {
    }

    public void refill(Bucket b) {
        int temp = this.nowVolume - b.nowVolume;
        if (temp >= 0)
            this.nowVolume = temp;
//        System.out.println(this.nowVolume);
    }

    public void refill(int vol) {
        int temp = this.nowVolume - vol;
        if (temp >= 0)
            this.nowVolume = temp;
//        System.out.println(this.nowVolume);
    }

    public int getVolume() {
        return nowVolume;
    }


}

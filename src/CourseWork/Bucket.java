package CourseWork;

class Bucket {

    //объём ведра
    int nowVolume;
    int maxVolume;

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

    //getter
    int getVolume() {
        return nowVolume;
    }


}

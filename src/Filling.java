import java.util.Scanner;

public class Filling {
    private int desVolume;
    Bucket one = new Bucket();//(setVolume(1));
    Bucket two = new Bucket();//(setVolume(2));
    Bucket three = new Bucket();//( setVolume(3));
    Bucket difference = new Bucket(Math.abs(two.getVolume() - three.getVolume()));
    boolean success = false;

    public void trueSuccess() {
        this.success = true;
    }

    //for testing purposes(start)
    Filling(int volumeOne, int volumeTwo, int volumeThree) {
        this.one = new Bucket(volumeOne);
        this.two = new Bucket(volumeTwo);
        this.three = new Bucket(volumeThree);
        this.difference = new Bucket(Math.abs(two.getVolume() - three.getVolume()));
    }

    Filling() {
    }

    public void setDesVolume(int volume) {
        desVolume = volume;
    }
    //for testing purposes (end)

    public int setVolume(int i) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter please volume of bucket number " + i);
        int volume = sc.nextInt();
        return volume;
    }

    public void setDesVolume() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter please desired volume of bucket");
        desVolume = sc.nextInt();
    }

    public int getDesVolume() {
        return this.desVolume;
    }

    public void recFill() {
        if (!success) {
            if (this.one.getVolume() == this.getDesVolume()) {
                trueSuccess();
                return;
            }
            if (this.one.getVolume() - this.two.getVolume() >= this.getDesVolume()) {
                this.one.refill(two);
                recFill();
                this.one.nowVolume += this.two.getVolume();
            }
            if (this.one.getVolume() - this.three.getVolume() >= this.getDesVolume()) {
                this.one.refill(three);
                recFill();
                this.one.nowVolume += this.three.getVolume();
            }
            if (this.one.getVolume() - this.difference.getVolume() >= this.getDesVolume()) {
                this.one.refill(difference);
                recFill();
                this.one.nowVolume += this.difference.getVolume();
            }
           return;
        }
    }

}


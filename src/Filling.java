import java.util.Scanner;

public class Filling {
    private int desVolume;
    Bucket one = new Bucket(/*false,*/ setVolume());
    Bucket two = new Bucket(/*true,*/setVolume());
    Bucket three = new Bucket(/*true,*/ setVolume());
    Bucket difference = new Bucket(/*true*/ Math.abs(two.getVolume() - three.getVolume()));

    public int setVolume() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter please volume of bucket");
        int volume = sc.nextInt();
        return volume;
    }

    public void setDesVol(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter please desired volume of bucket");
        desVolume = sc.nextInt();
    }

    public int getDesVolume(){
        return this.desVolume;
    }

    public void recFill(){
        // TODO: 22.11.2017 реализовать рекурсивную функцию для переливаний. По уменьшению объёма. Использовать проверку (?)
        //bigger
        //less
        //diff
        //while >
        //if == return
    }
}


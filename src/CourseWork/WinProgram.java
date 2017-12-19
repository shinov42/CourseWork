package CourseWork;

import javax.swing.*;
import java.util.ArrayDeque;

public class WinProgram {
    public static void main (String [] args) throws InterruptedException{
        JFrame myWindow = new Window();
        myWindow.setVisible(true);

    }
//
//    static void showVolume(int numb, JLabel one) {
//        ((ImageIcon) one.getIcon()).getImage().flush();
//        int temp = (int) Math.ceil((double) numb / 10) * 10;
//        switch (temp) {
//            case (100):
//                one.setIcon(new ImageIcon("buckets/Full.png"));
//                break;
//            case (90):
//                one.setIcon(new ImageIcon("buckets/nineTenth.png"));
//                break;
//            case (80):
//                one.setIcon(new ImageIcon("buckets/eightTenth.png"));
//                break;
//            case (70):
//                one.setIcon(new ImageIcon("buckets/sevenTenth.png"));
//                break;
//            case (60):
//                one.setIcon(new ImageIcon("buckets/sixTenth.png"));
//                break;
//            case (50):
//                one.setIcon(new ImageIcon("buckets/half.png"));
//                break;
//            case (40):
//                one.setIcon(new ImageIcon("buckets/fourTenth.png"));
//                break;
//            case (30):
//                one.setIcon(new ImageIcon("buckets/threeTenth.png"));
//                break;
//            case (20):
//                one.setIcon(new ImageIcon("buckets/twoTenth.png"));
//                break;
//            case (10):
//                one.setIcon(new ImageIcon("buckets/oneTenth.png"));
//                break;
//            case (0):
//                one.setIcon(new ImageIcon("buckets/empty.png"));
//                break;
//        }
//        one.setText(String.valueOf(numb));
//    }
//
//    static void changeBuckets(ArrayDeque<Integer> result, Filling buckets, JLabel one, JLabel two, JLabel three)
//            throws InterruptedException{
//        int temp;
//        while (result.size() != 0) {
//            temp = result.poll();
//            if (temp == buckets.two.getVolume()) {
//                buckets.one.maxVolume -= temp;
//                showVolume(buckets.two.getVolume(), two);
//                showVolume(0, three);
//                showVolume(buckets.one.maxVolume, one);
//                Thread.sleep(4000);
//
//            } else if (temp == buckets.three.getVolume()) {
//                buckets.one.maxVolume -= temp;
//                showVolume(buckets.three.getVolume(), two);
//                showVolume(buckets.one.maxVolume, one);
//                showVolume(0, two);
//                Thread.sleep(4000);
//
//            } else if (temp == buckets.difference.getVolume()) {
//                if (buckets.two.getVolume() > buckets.three.getVolume()) {
//                    buckets.one.maxVolume -= buckets.two.getVolume();
//                    showVolume(buckets.two.getVolume(), two);
//                    showVolume(0, three);
//                    Thread.sleep(4000);
//                    showVolume(buckets.two.getVolume() - buckets.three.getVolume(), two);
//                    showVolume(buckets.three.getVolume(), three);
//                    Thread.sleep(4000);
//                    buckets.one.maxVolume += buckets.three.getVolume();
//                    showVolume(buckets.one.maxVolume, one);
//                    showVolume(0, two);
//                    showVolume(0, three);
//                } else if (buckets.three.getVolume() > buckets.two.getVolume()) {
//                    buckets.one.maxVolume -= buckets.three.getVolume();
//                    showVolume(buckets.three.getVolume(), two);
//                    showVolume(0, two);
//                    Thread.sleep(4000);
//                    showVolume(buckets.three.getVolume() - buckets.two.getVolume(), two);
//                    showVolume(buckets.two.getVolume(), three);
//                    Thread.sleep(4000);
//                    buckets.one.maxVolume += buckets.two.getVolume();
//                    showVolume(buckets.one.maxVolume, one);
//                    showVolume(0, two);
//                    showVolume(0, three);
//                }
//            }
//
//        }
//    }
//
//    private void timeout() {
//    }
//
//    static String check(boolean success) {
//        if (success)
//            return ("Операция возможна");
//        else {
//            return ("Операция невозможна");
//        }
//    }
//}
}
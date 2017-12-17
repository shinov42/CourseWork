package CourseWork;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {

        Filling buck = new Filling();
        buck.setDesVolume();

        ArrayDeque<Integer> res = new ArrayDeque<>();
        buck.recFill(res);
        if (buck.success) {
            System.out.println(buck.one.getVolume() + " equals to " + buck.getDesVolume());
        } else System.out.println("Solution doesn't exist");
    }
}
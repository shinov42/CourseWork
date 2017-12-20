package CourseWork;

import static org.junit.Assert.assertEquals;

public class FillingTest {
    @org.junit.Test
    public void main() throws Exception {
        Filling temp1 = new Filling(87, 2, 3);
        temp1.setDesVolume(80);
        temp1.recFill();
        printResult(temp1);
        assertEquals(true, temp1.success);
        System.out.println();

        Filling temp2 = new Filling(18, 8, 2);
        temp2.setDesVolume(11);
        temp2.recFill();
        printResult(temp2);
        assertEquals(false, temp2.success);
        System.out.println();

        Filling temp3 = new Filling(18, 2, 1);
        temp3.setDesVolume(11);
        temp3.recFill();
        printResult(temp3);
        assertEquals(true, temp3.success);
        System.out.println();

        Filling temp4 = new Filling(10, 2, 5);
        temp4.setDesVolume(3);
        temp4.recFill();
        printResult(temp4);
        assertEquals(true, temp4.success);
        System.out.println();

        Filling temp5 = new Filling(17, 2, 4);
        temp5.setDesVolume(13);
        temp5.recFill();
        printResult(temp5);
        assertEquals(true, temp5.success);
        System.out.println();

        Filling temp6 = new Filling(17, 6, 4);
        temp6.setDesVolume(14);
        temp6.recFill();
        printResult(temp6);
        assertEquals(false, temp6.success);
        System.out.println();

        Filling temp7 = new Filling(168, 5, 9);
        temp7.setDesVolume(3);
        temp7.recFill();
        printResult(temp7);
        assertEquals(true, temp7.success);
        System.out.println();

        Filling temp8 = new Filling(100, 5, 4);
        temp8.setDesVolume(1);
        temp8.recFill();
        printResult(temp8);
        assertEquals(true, temp8.success);
        System.out.println();

        Filling temp9 = new Filling(200, 5, 4);
        temp9.setDesVolume(1);
        temp9.recFill();
        printResult(temp9);
        assertEquals(true, temp9.success);

        Filling temp10 = new Filling(17, 1, 0);
        temp10.setDesVolume(10);
        temp10.recFill();
        printResult(temp10);
        assertEquals(true, temp10.success);

        Filling temp11 = new Filling(99, 3, 10);
        temp11.setDesVolume(88);
        temp11.recFill();
        printResult(temp11);
        assertEquals(false, temp11.success);

        Filling temp12 = new Filling(100, 10, 20);
        temp12.setDesVolume(15);
        temp12.recFill();
        printResult(temp12);
        assertEquals(false, temp12.success);

        Filling temp13 = new Filling(500, 25, 50);
        temp13.setDesVolume(101);
        temp13.recFill();
        printResult(temp13);
        assertEquals(false, temp13.success);

        Filling temp14 = new Filling(108, 3, 5);
        temp14.setDesVolume(84);
        temp14.recFill();
        printResult(temp14);
        assertEquals(true, temp14.success);

        Filling temp15 = new Filling(800, 100, 10);
        temp15.setDesVolume(99);
        temp15.recFill();
        printResult(temp15);
        assertEquals(false, temp15.success);
    }

    private void printResult(Filling temp) {
        System.out.println("check, main one is " + temp.one.getVolume() + " and others are " + temp.two.getVolume() + " and " + temp.three.getVolume());
        System.out.println("desired volume is " + temp.getDesVolume());
        if (temp.success)
            System.out.println("solution exists");
        else
            System.out.println("solution doesn't exist");
    }
}


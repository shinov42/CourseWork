package CourseWork;

import static org.junit.Assert.assertEquals;

public class FillingTest {
    @org.junit.Test
    public void main() throws Exception {
        Filling temp1 = new Filling(87, 2, 3);
        System.out.println("check, main one is " + temp1.one.getVolume() + " and others are " + temp1.two.getVolume() + " and " + temp1.three.getVolume());
        temp1.setDesVolume(80);
        System.out.println("desired volume is " + temp1.getDesVolume());
        temp1.recFill();
        if (temp1.success)
            System.out.println("solution exists");
        else
            System.out.println("solution doesn't exist");
        assertEquals(true, temp1.success);
        System.out.println();

        Filling temp2 = new Filling(18, 8, 2);
        temp2.setDesVolume(11);
        temp2.recFill();
        System.out.println("check, main one is " + temp2.one.getVolume() + " and others are " + temp2.two.getVolume() + " and " + temp2.three.getVolume());
        System.out.println("desired volume is " + temp2.getDesVolume());
        if (temp2.success)
            System.out.println("solution exists");
        else
            System.out.println("solution doesn't exist");
        assertEquals(false, temp2.success);
        System.out.println();

        Filling temp3 = new Filling(18, 2, 1);
        temp3.setDesVolume(11);
        temp3.recFill();
        System.out.println("check, main one is " + temp3.one.getVolume() + " and others are " + temp3.two.getVolume() + " and " + temp3.three.getVolume());
        System.out.println("desired volume is " + temp3.getDesVolume());
        if (temp3.success)
            System.out.println("solution exists");
        else
            System.out.println("solution doesn't exist");
        assertEquals(true, temp3.success);
        System.out.println();

        Filling temp4 = new Filling(10, 2, 5);
        temp4.setDesVolume(3);
        temp4.recFill();
        System.out.print("check, main one is " + temp4.one.getVolume());
        System.out.println(" and others are " + temp4.two.getVolume() + " and " + temp4.three.getVolume());
        System.out.println("desired volume is " + temp4.getDesVolume());
        if (temp4.success)
            System.out.println("solution exists");
        else
            System.out.println("solution doesn't exist");
        assertEquals(true, temp4.success);
        System.out.println();

        Filling temp5 = new Filling(17, 2, 4);
        System.out.println("check, main one is " + temp5.one.getVolume() + " and others are " + temp5.two.getVolume() + " and " + temp5.three.getVolume());
        temp5.setDesVolume(13);
        System.out.println("desired volume is " + temp5.getDesVolume());
        temp5.recFill();
        if (temp5.success)
            System.out.println("solution exists");
        else
            System.out.println("solution doesn't exist");
        assertEquals(true, temp5.success);
        System.out.println();

        Filling temp6 = new Filling(17, 6, 4);
        temp6.setDesVolume(14);
        temp6.recFill();
        System.out.println("check, main one is " + temp6.one.getVolume() + " and others are " + temp6.two.getVolume() + " and " + temp6.three.getVolume());
        System.out.println("desired volume is " + temp6.getDesVolume());
        if (temp6.success)
            System.out.println("solution exists");
        else
            System.out.println("solution doesn't exist");
        assertEquals(false, temp6.success);
        System.out.println();

        Filling temp7 = new Filling(168, 5, 9);
        temp7.setDesVolume(3);
        temp7.recFill();
        System.out.println("check, main one is " + temp7.one.getVolume() + " and others are " + temp7.two.getVolume() + " and " + temp7.three.getVolume());
        System.out.println("desired volume is " + temp7.getDesVolume());
        if (temp7.success)
            System.out.println("solution exists");
        else
            System.out.println("solution doesn't exist");
        assertEquals(true, temp7.success);
        System.out.println();

        Filling temp8 = new Filling(100, 5, 4);
        temp8.setDesVolume(1);
        temp8.recFill();
        System.out.println("check, main one is " + temp8.one.getVolume() + " and others are " + temp8.two.getVolume() + " and " + temp8.three.getVolume());
        System.out.println("desired volume is " + temp8.getDesVolume());
        if (temp8.success)
            System.out.println("solution exists");
        else
            System.out.println("solution doesn't exist");
        assertEquals(true, temp8.success);
        System.out.println();

        Filling temp9 = new Filling(200, 5, 4);
        temp9.setDesVolume(1);
        temp9.recFill();
        assertEquals(true, temp9.success);

        Filling temp10 = new Filling(17, 1, 0);
        temp10.setDesVolume(10);
        temp10.recFill();
        assertEquals(true, temp10.success);

        Filling temp11 = new Filling(99, 3, 10);
        temp11.setDesVolume(88);
        temp11.recFill();
        assertEquals(false, temp11.success);

        Filling temp12 = new Filling(100, 10, 20);
        temp12.setDesVolume(15);
        temp12.recFill();
        assertEquals(false, temp12.success);

        Filling temp13 = new Filling(500, 25, 50);
        temp13.setDesVolume(101);
        temp13.recFill();
        assertEquals(false, temp13.success);

        Filling temp14 = new Filling(108, 3, 5);
        temp14.setDesVolume(84);
        temp14.recFill();
        assertEquals(true, temp14.success);

        Filling temp15 = new Filling(800, 100, 10);
        temp15.setDesVolume(99);
        temp15.recFill();
        assertEquals(false, temp15.success);
    }
}


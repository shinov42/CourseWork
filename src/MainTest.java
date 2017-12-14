import static org.junit.Assert.*;

public class MainTest {
    @org.junit.Test
    public void main() throws Exception {
        Filling temp1 = new Filling(87, 2, 3);
        temp1.setDesVolume(80);
        temp1.recFill();
        assertEquals(true, temp1.success);

        Filling temp2 = new Filling(18, 8, 2);
        temp2.setDesVolume(11);
        temp2.recFill();
        assertEquals(false, temp2.success);

        Filling temp3 = new Filling(18, 2, 1);
        temp3.setDesVolume(11);
        temp3.recFill();
        assertEquals(true, temp3.success);

        Filling temp4 = new Filling(10, 2, 5);
        temp4.setDesVolume(3);
        temp4.recFill();
        assertEquals(true, temp4.success);

        Filling temp5 = new Filling(17, 2, 4);
        temp5.setDesVolume(13);
        temp5.recFill();
        assertEquals(true, temp5.success);

        Filling temp6 = new Filling(17, 6, 4);
        temp6.setDesVolume(14);
        temp6.recFill();
        assertEquals(false, temp6.success);

        Filling temp7 = new Filling(168, 5, 9);
        temp7.setDesVolume(3);
        temp7.recFill();
        assertEquals(true, temp7.success);

        Filling temp8 = new Filling(100, 5, 4);
        temp8.setDesVolume(1);
        temp8.recFill();
        assertEquals(true, temp8.success);

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

        Filling temp12 = new Filling(100 , 10, 20);
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

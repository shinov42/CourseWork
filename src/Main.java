public class Main {
    public static void main(String[] args) {

        Filling buck = new Filling();
        buck.setDesVolume();

        buck.recFill();
        if (buck.success) {
            System.out.println(buck.one.getVolume() + " equals to " + buck.getDesVolume());
        } else System.out.println("Solution doesn't exist");
    }

}

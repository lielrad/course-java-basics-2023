public class Vehicle implements Move{

    @Override
    public void move_fast() {
        // The body of moveFast() is provided here
        System.out.println("Fast speed... - вжик и нету");
    }

    @Override
    public void move_slow() {
        // The body of moveSlow() is provided here
        System.out.println("Slow speed... - ползем, как черепаха");
    }
}

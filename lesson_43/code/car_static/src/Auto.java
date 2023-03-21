public class Auto extends Car {

    int capacity;

    public void paint() {
        System.out.println("Красим автомобиль");
    }
    @Override
    public String toString() {
        return "Auto{" +
                "capacity=" + capacity +
                ", age=" + age +
                ", color='" + color +
                ", platform='" + platform + '\'' +
                '}';
    }
}

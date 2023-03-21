public class Car {

    int age;
    String color;
    static final String platform = "Number one";



    public void paint() {
        System.out.printf("Автомобиль покрашен в %s цвет", color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "age=" + age +
                ", color='" + color +
                ", platform='" + platform + '\'' +
                '}';
    }
}

public class Auto extends Car {
    String brand;
    int capacity;

    public Auto(int age, String usage, int speed, String brand, int capacity) {
        super(age, usage, speed);
        this.brand = brand;
        this.capacity = capacity;
    }

    @Override
    public void go() {
        System.out.println("Едем по дороге всей семьей");
        this.speed = speed;
        System.out.println("Скорость: " + speed);
    }

    @Override
    public void stop() {
        System.out.println("Автомобиль остановился");
        speed = 0;
        System.out.println("Скорость: " + speed);
    }

    @Override
    public void speed_up() {
        System.out.print("Увеличиваем скорость. ");
        speed += 10;
        System.out.println("Скорость выросла: " + speed);
    }

    @Override
    public void speed_down() {
        System.out.print("Уменьшаем скорость. ");
        speed -= 10;
        System.out.println("Скорость упала: " + speed);
    }

    @Override
    public String toString() {
        return "\nAuto{" +
                "brand='" + brand + '\'' +
                ", capacity=" + capacity +
                ", age=" + age +
                ", usage='" + usage + '\'' +
                ", speed=" + speed +
                '}';
    }
}

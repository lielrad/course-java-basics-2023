public class Bus extends Car {

    String brand;
    int seats;

    public Bus(int age, String usage, int speed, String brand, int seats) {
        super(age, usage, speed);
        this.brand = brand;
        this.seats = seats;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override  // переопределяем метод, заданный в родительском классе Car
    public void go() {
        System.out.println("Едем по дороге с пассажирами");
        this.speed = speed; // эта скорость равна скорости, которую мы задаем
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public void speed_up() {
        System.out.println("Увеличиваем скорость");
        speed += 10;
        System.out.println("Скорость выросла: " + speed);
    }

    @Override
    public void speed_down() {
        System.out.println("Уменьшаем скорость");
        speed -= 10;
        System.out.println("Скорость упала: " + speed);
    }

    @Override
    public String toString() {
        return "\nBus{" +
                "brand='" + brand + '\'' +
                ", seats=" + seats +
                ", age=" + age +
                ", usage='" + usage + '\'' +
                ", speed=" + speed +
                '}';
    }
}


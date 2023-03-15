public class Track extends Car {

String brand;
int load_weight;

    public Track(int age, String usage, int speed, String brand, int load_weight) {
        super(age, usage, speed);
        this.brand = brand;
        this.load_weight = load_weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getLoad_weight() {
        return load_weight;
    }

    public void setLoad_weight(int load_weight) {
        this.load_weight = load_weight;
    }

    @Override
    public void go() {
        System.out.println("Едем по дороге, везем важный груз.");
        this.speed = speed;
    }

    @Override
    public void stop() {
        System.out.println("Остановились");
        speed = 0;
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
        return "\nTrack{" +
                "brand='" + brand + '\'' +
                ", load_weight=" + load_weight +
                ", age=" + age +
                ", usage='" + usage + '\'' +
                ", speed=" + speed +
                '}';
    }
}

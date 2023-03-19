public class Bus1 {
//        Создать класс Bus с атрибутами: номер маршрута, водитель, вместимость 36 мест,
//              скорость на маршруте (не может быть больше 60 км/ч), стоимость проезда 2 евро.
//        В классе Bus создайте метод setDriver, который принимает имя драйвера и назначает его водителем автобуса.
//        Сформируйте информацию об автобусе в следующем виде:
//              Информация об автобусе: Номер маршрута:__ Вместимость:__ кресел Водитель:___ Скорость на маршруте:__
    private int bus_line; // номер маршрута
    public Driver1 driver; // водитель взят из класса Driver1
    int capacity;  // вместимость
    int  speed;  // скорость автобуса
    int price;  //  стоимость проезда
    // конструктор автобуса с проверкой скорости автобуса
    public Bus1(int line, int capacity, int speed, int price) {
        this.bus_line = line;
        this.capacity = capacity;
        if (speed <= 60) {
            this.speed = speed;
        } else {
            System.out.println("Автобус с слишком высокой скоростью, это небезопасно.");


        }
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bus1{" +
                "Bus information:\n" +
                "bus_line = " + bus_line + "\n" +
                ", driver = " + driver + "\n" +
                ", capacity = " + capacity + "\n" +
                ", speed = " + speed + "\n" +
                ", price =" + price + "\n" +
                ", daily revenue = " + daily_revenue() + "\n" +
                '}';
    }
    // сеттер назначает водителя для класса Bus из класса Driver1
    public void setDriver(Driver1 driver) {
        this.driver = driver;
    }
    // метод, который связывает автобус и водителя
    public void go() {
        System.out.println("Автобус" + this.bus_line + " поехал под управлением "+ driver.getDriver_name()
        );
    }
//        Среднестатистическая заполняемость автобуса составляет 60% от его вместимости. Автобус за день
//              совершает 5 рейсов по маршруту. Рассчитайте объем дневной выручки от работы автобуса.
    public Driver1 getDriver() {
        return  driver;
    }
    public int daily_revenue () {
        int daily_revenue;
        int num_of_trips = 5;
        int average_occupancy = capacity / 100 * 60;
        return daily_revenue = average_occupancy * num_of_trips * price;
    }
}

public class Driver1 {
    String driver_name;
    int driver_age;
    Bus1 bus; // автобус, на котором ездит водитель

    // конструктор с контролем
    public Driver1(String driver_name, int driver_age) {
        this.driver_name = driver_name;
        if (driver_age >= 21 && driver_age < 65) {
            this.driver_age = driver_age;
            System.out.println("The driver is allowed to drive this bus.");
        } else {
            System.out.println("The driver is not allowed to drive this bus.");
        }
    }

    // привязка водителя к автобусу
    public void go(Bus1 bus) {
        this.bus = bus;
        this.bus.setDriver(this);
    }

    // метод, который отображает, что водитель поехал на автобусе
    public  void drive() {
        this.bus.go();  // вызываем метод из класса Bus
    }
    public String getDriver_name() {
        return driver_name;
    }
}

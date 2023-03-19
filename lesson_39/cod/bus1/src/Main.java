public class Main {
    public static void main(String[] args) {

        // Создаём автобус
        Bus1 bus1 = new Bus1(1, 36, 60, 2);
        // Создаем водителя
        Driver1 d1 = new  Driver1("Driver Driver", 25);

        Bus1 bus2 = new Bus1(1, 36, 60, 2);
        Driver1 d2 = new  Driver1("Баран Баранкин", 40);

        // назначаем водителя на автобус
        d1.go(bus1);
        // печатаем информацию о маршруте
        System.out.println("\nВодитель автобуса: " + bus1.getDriver().getDriver_name());

        d1.go(bus1);
        System.out.println("\nВодитель автобуса: " + bus2.getDriver().getDriver_name());


    }
}
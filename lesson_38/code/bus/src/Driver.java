public class Driver {
//        Создать класс Driver с атрибутами: имя водителя, возраст (должен быть старшше 21 года и не старше 65 лет).
    String driver_name;
    int driver_age;

//    public Driver(String driver, int driver_age) {
//        super(line, driver, capacity, speed, price);
//        this.driver_name = driver_name;
//        this.driver_age = driver_age;
//    }


    public Driver(String driver_name, int driver_age) {
        this.driver_name = driver_name;
        this.driver_age = driver_age;
    }

    public void setDriver_age(int driver_age) {
        if (driver_age < 21) {
            System.out.println("You are too young to drive this bus. Wait until you are 21 years old.");
        } else if (driver_age >= 65) {
            System.out.println("You are too old to drive this bus. You have to look for another job.");
        } else {
            this.driver_age = driver_age;
        }
    }
}

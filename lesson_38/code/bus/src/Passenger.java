public class Passenger {
    //        Создать класс Passenger с атрибутами: имя, возраст (должен быть старше 10 лет).

    String passenger_name;
    int passenger_age;

    public void setPassenger_age(int passenger_age) {
        if (passenger_age < 10) {
            System.out.println("You can't get on the bus alone. Return with some adult.");
        } else {
            this.passenger_age = passenger_age;
        }
    }
}

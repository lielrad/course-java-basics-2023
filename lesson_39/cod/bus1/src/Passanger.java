public class Passanger {
    String name;
    int age;

    public Passanger (String name, int age) {
        this.name = name;
        if (age >= 10) {
            this.age = age;
        } else {
            System.out.println("Passenger too young");
        }
    }
}

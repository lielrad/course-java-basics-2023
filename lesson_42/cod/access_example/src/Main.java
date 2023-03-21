public class Main {
    public static void main(String[] args) {

        System.out.println("Доступ к полям класса (модификаторы public, private");

        Person person = new Person("Kate", 32, "Baker Street", "+12345678");
        person.displayName();
        person.displayAge();
        // displayAddress() метод недоступен, потому что он protected
        person.displayTelephone();
    }
}
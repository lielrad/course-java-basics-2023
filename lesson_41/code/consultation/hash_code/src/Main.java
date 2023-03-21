public class Main {
    public static void main(String[] args) {

        System.out.println("Хэш код объекта\n");

        Person person1 = new Person("Tom");
        System.out.println(person1.hashCode());

        Person person2 = new Person("Jack");
        System.out.println(person2.hashCode());
    }
}
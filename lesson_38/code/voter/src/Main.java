public class Main {
    public static void main(String[] args) {

        System.out.println("Контроль возраста избирателя на уровне конструктора");
        System.out.println();

        Voter v1 = new Voter("1234567890", 15, "Willy");
        System.out.println(v1);
        System.out.println();
        Voter v2 = new Voter("09876543d21", 35, "Billy");

        Voter v3 = new Voter("1029384756", 53, "Milly");

        System.out.println(v2);
        System.out.println(v3);
    }
}
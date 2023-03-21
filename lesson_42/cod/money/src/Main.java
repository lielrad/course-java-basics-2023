public class Main {
    public static void main(String[] args) {

        System.out.println("Сравнение для класса Money");

        Money m1 = new Money(1000, "usd");
        m1.toString();
        System.out.println(m1);

        Money m2 = new Money(1000, "euro");
        Money m3 = new Money(1000, "usd");

        System.out.println("m1.equals(m3)" + m1.equals(m3));
        m2.toString();
        System.out.println("m1.equals(m2)" + m1.equals(m2));
        m3.toString();
    }
}
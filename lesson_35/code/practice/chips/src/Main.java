public class Main {
    public static void main(String[] args) {
/*
        Doritos Spicy Nacho 60
 */

        Chips chips1 = new Chips("Sour Cream & Onion", "Lay’s", 80);
        System.out.println(chips1);

        Chips chips2 = new Chips("Cheddar Cheese", "Pringles", 40);
        System.out.println(chips2);

        Chips chips3 = new Chips("Spicy Nacho", "Doritos", 60);
        System.out.println(chips3);

        System.out.println();
        chips1.onStock(8);

    }
}
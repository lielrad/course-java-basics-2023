public class Main {
    public static void main(String[] args) {


        System.out.println("дз: класс Шоколад - весь сценарий");

        Chocolate chocolate_1 = new Chocolate("70% Cacao", "Lindt", 70);
        Chocolate chocolate_2 = new Chocolate("Dairy Milk", "Cadbury", 20);
        Chocolate chocolate_3 = new Chocolate("SYMPHONY", "Hershey's", 25);

        System.out.println(chocolate_1.toString());
        System.out.println(chocolate_2.toString());
        System.out.println(chocolate_3.toString());

        System.out.println(chocolate_1.getBrand());
        chocolate_1.setName("jkjkl");
        System.out.println(chocolate_1.getName());


//        Chocolate chocolate_1 = new Chocolate();
//        chocolate_1.name = "70% Cacao";
//        chocolate_1.brand = "Lindt";
//        chocolate_1.cocoaPercentage = 70;
//
//        Chocolate chocolate_2 = new Chocolate();
//        chocolate_2.name = "Dairy Milk";
//        chocolate_2.brand = "Cadbury";
//        chocolate_2.cocoaPercentage = 20;
//
//        Chocolate chocolate_3 = new Chocolate();
//        chocolate_3.name = "SYMPHONY";
//        chocolate_3.brand = "Hershey's";
//        chocolate_3.cocoaPercentage = 25;


    }
}
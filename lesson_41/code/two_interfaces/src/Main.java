public class Main {
    public static void main(String[] args) {

        System.out.println("Пример класса с двумя интерфейсами\n");

        BankCard card = new BankCard();
        card.creditMethod();
        card.debitMethod();
    }
}
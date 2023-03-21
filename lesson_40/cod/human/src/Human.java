public class Human {
    String first_name;
    String last_name;

    // конструктор класса
    public Human(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }

    // метод, который отправляет человека на работу
    public void work() {
        System.out.println("Человек устроился на должность и пошел на работу");
    }
}

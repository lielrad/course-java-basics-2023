public class Main {
    public static void main(String[] args) {

//        Выбираем каждый свой класс для создания, задаем его в новом файле,
//        создаем конструктор, геттер и сеттер, переопределяем метод toString

        Pen pen1 = new Pen("Berlingo", "yellow", 2);
        System.out.println(pen1);
        pen1.setColor("blue");
        System.out.println(pen1);
        System.out.println("price: " + pen1.getPrice());
    }
}
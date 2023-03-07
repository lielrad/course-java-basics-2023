public class Main {
    public static void main(String[] args) {

//        Задача 1. Создайте класс Wine, который содержит переменные name, sort и year.
//        Создайте три экземпляра этого класса. Выведите на консоль значения их переменных методом toString.
//        Добавить в класс Wine метод: onStock, имеет один параметр – количество бутылок.
//        Выводит на консоль сообщение "На складе имеется количество бутылок".
//        Задайте метод getYear – возвращает год производства вина. Вызвать этот метод для каждого из объектов.

        Wine w1 = new Wine();
        w1.name = "Twill Cellars";
        w1.sort = "Chardonnay";
        w1.year = 2018;

        Wine w2 = new Wine();
        w2.name = "JESSE KATZ";
        w2.sort = "EXPOSED CABERNET SAUVIGNON";
        w2.year = 2018;

        Wine w3 = new Wine();
        w3.name = "RICHARD BRUNO";
        w3.sort = "PETITE SIRAH";
        w3.year = 2018;

        System.out.println(w1.toString());
        System.out.println(w2.toString());
        System.out.println(w3.toString());


    }
}
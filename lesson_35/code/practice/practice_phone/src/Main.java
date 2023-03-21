public class Main {
    public static void main(String[] args) {

//      Практикум с классом Phone: Создайте класс Phone, который содержит переменные number, brand и model.
//      Создайте три экземпляра этого класса. Выведите на консоль значения их переменных методом toString.
//      Добавить в класс Phone метод: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит name”.
//      Задайте метод getNumber – возвращает номер телефона. Вызвать этот метод для каждого из объектов.
//      Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, brand и model.

        Practice_phone phone1 = new Practice_phone(567780896, "Samsung", "A20");
        Practice_phone phone2 = new Practice_phone(12323454, "Apple", "iPhone 4");
        Practice_phone phone3 = new Practice_phone(01010100, "Xiaomi", "ABC-15");

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        System.out.println();

        phone1.receive_call("mom");
        phone2.receive_call("dad");
        phone3.receive_call("stranger");
        System.out.println();

        System.out.println("number of phone1: " + phone1.getNumber());
        System.out.println("number of phone2: " + phone2.getNumber());
        System.out.println("number of phone3: " + phone3.getNumber());

    }
}
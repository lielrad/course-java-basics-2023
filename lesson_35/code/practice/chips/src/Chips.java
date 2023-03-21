public class Chips {
//  Создайте класс Wine, который содержит переменные name, sort и year.
//  Создайте три экземпляра этого класса. Выведите на консоль значения их переменных методом toString.
//  Добавить в класс Wine метод: onStock, имеет один параметр – количество бутылок.
//  Выводит на консоль сообщение "На складе имеется количество бутылок".
//  Задайте метод getYear – возвращает год производства вина. Вызвать этот метод для каждого из объектов.

//    Можно выполнить это задание на примере собственного класса с тремя полями.


    String name;
    String brand;
    int weight;

    public Chips(String name, String brand, int weight) {
        this.name = name;
        this.brand = brand;
        this.weight = weight;
    }

    public void onStock (int num_on_stock) {
        System.out.println("Number of boxes on ctock: " + num_on_stock);
    }

    @Override
    public String toString() {
        return "Chips{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", weight=" + weight +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("Internet shop.v0.1\n");

        //Product product1 = new Product ("Apple Watch", 500.0, 5);
        //Product product2 = new Product("сметана", 0.5, 5);

        // Создает продукты (объекты) в классе Products
        Product p1 = new Product("утюг", 80, 5);
        Product p2 = new Product("кофемашина", 300, 4);
        Product p3 = new Product("холодильник", 600, 7);
        Product p4 = new Product("компьютер", 600, 7);
        Product p5 = new Product("ноутбук", 1000, 7);

        System.out.println(p2.equals(1));
    }

}

//        **Интернет магазин, часть 1**
//        Создать класс Товар, имеющий переменные имя, цена, рейтинг.
//        Создать класс Категория, имеющий переменные имя и массив товаров.
//        Создать несколько объектов класса Категория.
//        Создать класс Basket, содержащий массив купленных товаров.
//        Создать класс User, содержащий логин, пароль и объект класса Basket.
//        Создать несколько объектов класса User.
//        Вывести на консоль каталог продуктов.
//        Вывести на консоль покупки посетителей магазина.
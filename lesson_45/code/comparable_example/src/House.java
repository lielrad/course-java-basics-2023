public class House implements Comparable <House> {

    int area; // площадь
    int price; // цена
    String city; // город

     // конструктор класса
    public House(int area, int price, String city) {
        this.area = area;
        this.price = price;
        this.city = city;
    }

    @Override   //
    public String toString() {
        return "\nHouse{" +
                "area=" + area +
                ", price=" + price +
                ", city=" + city +
                '}';
    }
//    @Override
//    public int compareTo(House anotherHouse) { // сигнатура метода; тип возвращаемого значения, наименование метода и параметры
//        if (this.area == anotherHouse.area) { // условие сравнения площади дома, это математическое сравнение
//            return 0; // возвращаем 0 если площади равны
//        } else if (this.area < anotherHouse.area) { // сравниваем площади
//            return -1; // если одна площадь меньше второй
//        } else {
//            return 1; // если одна площадь больше второй
//        }
//    }

    @Override
    public int compareTo(House anotherHouse) { // сигнатура метода; тип возвращаемого значения, наименование метода и параметры
        if (this.price == anotherHouse.price) { // условие сравнения цены дома, это математическое сравнение
            return 0; // возвращаем 0 если цены равны
        } else if (this.price < anotherHouse.price) { // сравниваем цены
            return -1; // если одна цена меньше второй
        } else {
            return 1; // если одна цена больше второй
        }
    }
}

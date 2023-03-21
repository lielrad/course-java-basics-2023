public class Practice_phone {
//      Практикум с классом Phone: Создайте класс Phone, который содержит переменные number, brand и model.
//      Создайте три экземпляра этого класса. Выведите на консоль значения их переменных методом toString.
//      Добавить в класс Phone метод: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит name”.
//      Задайте метод getNumber – возвращает номер телефона. Вызвать этот метод для каждого из объектов.
//      Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, brand и model.

    int number;
    String brand;
    String model;

    public Practice_phone(int number, String brand, String model) {
        this.number = number;
        this.brand = brand;
        this.model = model;
    }

    public void receive_call (String name) {
        System.out.println("you have call from " + name);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Practice_phone{" +
                "number=" + number +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}

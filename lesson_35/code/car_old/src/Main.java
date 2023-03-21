public class Main {
    public static void main(String[] args) {
//    Создаем класс Car внутри класса Main, сождаем экземпляры класса Car - каждый про свой автомобиль

        Car_old car1 = new Car_old();
        car1.name = "Mashina";
        car1.color = "blue";
        car1.year = 1968;

        System.out.println(car1);
    }
}
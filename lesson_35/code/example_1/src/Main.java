public class Main {
    public static void main(String[] args) {

        System.out.println("Пример создания класса");

        class Car {  //придумали имя класса
            String brand;  //  описали главные его поля - характеристики
            String color;
            int year;
            String type;
        }

        Car myCar = new Car();
        myCar.brand = "VW";
        myCar.color = "silver";
        myCar.type = "universal";
        myCar.year = 2018;

        //System.out.println("Марка автомобиля: " + myCar.brand);  // Марка автомобиля: VW
        //System.out.println(myCar);  // Main$1Car@119d7047
        //System.out.println("Марка автомобиля: " + myCar.brand + ", цвет: " + myCar.color + ", год выпуска: " + myCar.year);

        Pet myPet = new Pet();
        myPet.type = "cat";
        myPet.breed = "Burmese";
        myPet.name = "Benjamine";
        myPet.weight = 4.5;

        //System.out.println("Тип: " + myPet.type + ", Порода: " + myPet.breed + ", Имя: " + myPet.name + ", Вес: " + myPet.weight);

        System.out.println(myPet.toString());
        // myPet.toString();  // так не работает

        //Pet{type='cat', breed='Burmese', name='Benjamine', weight=4.5}

        // Pet{type='cat, breed='Burmese', name='Benjamine', weight=4.5}
    }
}
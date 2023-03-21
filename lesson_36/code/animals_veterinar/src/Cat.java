public class Cat extends Animal {  // класс Cat расширяет \ наследует от Animal
    String breed; // это поле для породы

    // конструктор
    public Cat(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    // метод для звуков
    public void makeNoise(){
        System.out.println("Кошка издает звуки: Мяууу-мяууу...");
    }

    public void eat() {
        System.out.println("Кошка ест Kitti Cat...");
    }

    public void getDescription(){
        System.out.println("Это подробное описание семейства кошачьих...");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

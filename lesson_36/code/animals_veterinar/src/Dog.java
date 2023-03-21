public class Dog extends Animal {  // класс Dog расширяет \ наследует от Animal
    String breed; // это поле для породы

    // конструктор
    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    // метод для звуков
    public void makeNoise(){
        System.out.println("Собака издает звуки: Гав-гав...");
    }

    public void eat() {
        System.out.println("Собака ест мясо и кашу...");
    }

    public void getDescription(){
        System.out.println("Это подробное описание семейства псовых...");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

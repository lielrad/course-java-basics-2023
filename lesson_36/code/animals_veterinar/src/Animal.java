public abstract class Animal {
    String name;  // это будут кошка, собака, медведь и т.д.

    // метод для звуков
    public void makeNoise(){
    }

    // метод для еды
    public void eat() {
    }

    // метод выводит описание
    public void getDescription(){
    }

    // сеттер имени (собака, кошка или медведь)
    public Animal(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Human {
    public int age; // открытое поле класса, отвечает за возраст
    public boolean is_working; // открытое поле класса, отвечает за статус: работает или нет

    public Human(int age, boolean is_working) {
        this.age = age;
        this.is_working = is_working;
    }
}

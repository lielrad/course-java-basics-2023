public class Teacher extends Human{

    public Teacher(String first_name, String last_name) {
        super(first_name, last_name);
    }

    // переопределяем метод
    @Override
    public void work() {
        System.out.println("Учит и объясняет");
        study();  // дополнительный метод Work
    }

    // реализация метода study
    public void study() {
        System.out.println("Учебный процесс пошел");
    }
}

public class Programmer extends Human {

    // конструктор класса
    public Programmer(String first_name, String last_name) {
        super(first_name, last_name);
    }

    @Override
    public void work() {  // переопределяем метод Work
        System.out.println("Программист любит писать код");
        do_code(); // еще один метод который мы придумали
    }

    public void do_code() { // реализация метода do_code
        System.out.println("Сидит за клавиатурой, думает, печатает код и кайфует");
    }
}

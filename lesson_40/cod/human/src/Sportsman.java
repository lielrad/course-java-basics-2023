public class Sportsman extends Human {

    public Sportsman(String first_name, String last_name) {
        super(first_name, last_name);
    }

    @Override
    public void work() {
        System.out.println("Надо идти на тренировку");
        play_football(); // дополнительный метод
    }

    public void play_football() {  // реализация метода play_football
        System.out.println("Бегает с мячиком");
    }
}

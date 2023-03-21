public class Main {
    public static void main(String[] args) {

        Human human = new Human("Александр", "Александров");
        Programmer programmer = new Programmer("Киану", "Ривз");
        Teacher teacher = new Teacher("Мария", "Евдокимова");
        Sportsman sportsman = new Sportsman("Разиль", "Миниахметов");

        human.work();
        programmer.work();
        teacher.work();
        sportsman.work();

        //  это восходящее преобразования, такой пример создания экземпляров класса в Human
        Human human1 = programmer;
        Human human2 = teacher;
        Human human3 = sportsman;

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);

        human1.work();
        human2.work();
        human3.work();


    }
}
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        System.out.println("Сравниваем компьютеры");
        // Создать 5 компьютеров (объекты нашего класса Computer)
        // Создать TreeSet - класс, структура для хранения данных
        // положим в TreeSet эти 5 объектов
        // распечатать TreeSet
        // убедиться, что объекты в нем отсортированы в порядке возрастания по полю hard_disk_size

        Computer comp1 = new Computer("laptop", 8, 512, "Win 10 Home");
        Computer comp2 = new Computer("desktop", 16, 1024, "Windows 10 Pro");
        Computer comp3 = new Computer("server", 64, 2048, "Windows Server");
        Computer comp4 = new Computer("laptop", 32, 256, "MacOS");
        Computer comp5 = new Computer("desktop", 32, 128, "Linux");

        TreeSet computers = new TreeSet();

        computers.add(comp1);
        computers.add(comp2);
        computers.add(comp3);
        computers.add(comp4);
        computers.add(comp5);

        System.out.println(computers);
    }
}
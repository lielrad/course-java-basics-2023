public class Computer implements Comparable<Computer> {
    String type;
    int operate_memory;
    int hard_disk_size;
    String operating_system;

    // конструктор класса
    public Computer(String type, int operate_memory, int hard_disk_size, String operating_system) {
        this.type = type;
        this.operate_memory = operate_memory;
        this.hard_disk_size = hard_disk_size;
        this.operating_system = operating_system;
    }

    @Override
    public String toString() {
        return "\nComputer{" +
                "type='" + type + '\'' +
                ", operate_memory=" + operate_memory +
                ", hard_disk_size=" + hard_disk_size +
                ", operating_system='" + operating_system + '\'' +
                '}';
    }

    //
    @Override
    public int compareTo(Computer computer) {
        if (this.hard_disk_size == computer.hard_disk_size) { // условие сравнения цены дома, это математическое сравнение
            return 0; // возвращаем 0 если цены равны
        } else if (this.hard_disk_size < computer.hard_disk_size) { // сравниваем цены
            return -1; // если одна цена меньше второй
        } else {
            return 1; // если одна цена больше второй
        }
    }
}

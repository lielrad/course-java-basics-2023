public class Wine {
    String name;
    String sort;
    int year;

    //  Alt + Insert >> toString() - вызов окна Generate - для автоматической генерации методов,
    //                               в данном случае для печати класса


    // это метод, который переопределяет стандартный еoString
    @Override
    public String toString() {
        return "Wine{" +
                "name='" + name + '\'' +
                ", sort='" + sort + '\'' +
                ", year=" + year +
                '}';
    }

    public String onStock (int n) {

        return("Количество бутылок на складе: " + n );
    }

    public int getYear() {
        return year;
    }
}


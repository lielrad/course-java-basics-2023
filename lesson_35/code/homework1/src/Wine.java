

    public class Wine {
        String name;
        String sort;
        int year;

        //  Alt + Insert >> toString() - вызов окна Generate - для автоматической генерации методов,
        //                               в данном случае для печати класса
        @Override
        public String toString() {
            return "Wine{" +
                    "name='" + name + '\'' +
                    ", sort='" + sort + '\'' +
                    ", year=" + year +
                    '}';
        }
    }




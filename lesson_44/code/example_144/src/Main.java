import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        System.out.println("Пример наполнения TreeSet");

        TreeSet ts = new TreeSet(); // создаем новый элемент класса TreeSet
        ts.add("C");
        ts.add("a");
        ts.add("John");
        ts.add("S");
        ts.add("a_a_a");
        ts.add("a a a");
        ts.add("D");
        ts.add("10");
        ts.add("M");
        ts.add("A");

        TreeSet tsNum = new TreeSet();
        tsNum.add(9);
        tsNum.add(5);
        tsNum.add(12);
        tsNum.add(6);
        tsNum.add(25);
        tsNum.add(6);
        tsNum.add(17);
        tsNum.add(2);
        System.out.println(tsNum);



        System.out.println("Пример со строками");
        // выводим на печать
        System.out.println(ts);



    }
}
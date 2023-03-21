import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Пример наследования с классом Dancer ");

        TwistDancer d2 = new TwistDancer("Танцор Твиста", 27, "m");
        d2.dance();

        BreakDancer d3 = new BreakDancer("Танцовщица Брейк-данса", 26, "f");
        d3.dance();

        ClassicDanser d4 = new ClassicDanser("Танцор Всего-подряд", 30, "m");
        d4.dance();

        List<Dancer> dancerList = new ArrayList<>();
        dancerList.add(d2);
        dancerList.add(d3);
        dancerList.add(d4);

        System.out.println(dancerList);

        for (int i = 0; i < dancerList.size(); i++) {
            System.out.println(dancerList.get(i));
        }
    }
}
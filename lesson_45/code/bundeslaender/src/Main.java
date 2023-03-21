import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        System.out.println("Создайте TreeSet и внесите в него федеративные земли Германии. \nВыведите список земель на печать.");
        TreeSet bund = new TreeSet();

        bund.add("Schleswig-Holstein SH\n");
        bund.add("Baden-Württemberg BW\n");
        bund.add("Bayern BY\n");
        bund.add("Brandenburg BB\n");
        bund.add("Bremen HB\n");
        bund.add("Hamburg HH\n");
        bund.add("Hessen HE");
        bund.add("Mecklenburg-Vorpommern MV\n");
        bund.add("Niedersachsen NI\n");
        bund.add("Nordrhein-Westfalen NRW\n");
        bund.add("Rheinland-Pfalz RP\n");
        bund.add("Saarland SL\n");
        bund.add("Sachsen SN\n");
        bund.add("Sachsen-Anhalt ST\n");
        bund.add("Thüringen TH\n");
        bund.add("Berlin BE\n");
        bund.add("Berlin BE\n");

        System.out.println(bund);


    }
}
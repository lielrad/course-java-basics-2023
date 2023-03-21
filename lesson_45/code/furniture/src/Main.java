import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {

        System.out.println("сравнить предметы мебели");

        Furniture f1 = new Furniture("chair", 300, 7);
        Furniture f2 = new Furniture("closet", 3000, 250);
        Furniture f3 = new Furniture("bed", 1500,90);
        Furniture f4 = new Furniture("sofa", 4500,150);
        Furniture f5 = new Furniture("table", 400, 40);

        TreeSet furnitureList = new TreeSet();
        furnitureList.add(f1);
        furnitureList.add(f2);
        furnitureList.add(f3);
        furnitureList.add(f4);
        furnitureList.add(f5);

        System.out.println(furnitureList);

    }
}
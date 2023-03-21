
public class Furniture implements Comparable<Furniture> {

    String name;
    int price;
    int weight;

    public Furniture(String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "\nFurniture{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }

//    @Override
//    public int compareTo (Furniture anotherFurniture) {
//        if (this.price == anotherFurniture.price) {
//            return 0;
//        } else if (this.price < anotherFurniture.price) {
//            return -1;
//        } else {
//            return 1;
//        }
//    }

    @Override
    public int compareTo (Furniture anotherFurniture) {
        if (this.weight == anotherFurniture.weight) {
            return 0;
        } else if (this.weight < anotherFurniture.weight) {
            return -1;
        } else {
            return 1;
        }
    }


}

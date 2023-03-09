public class Pet {
    String type;
    String breed;
    String name;
    double weight;
    //  Alt + Insert >> toString() - вызов окна Generate - для автоматической генерации методов,
    //                               в данном случае для печати класса


    @Override   //  переопределение
    public String toString() {
        return "Pet{" +
                "type='" + type +  //  + '\''
                ", breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

}

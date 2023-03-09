public class Chocolate {

    String name;
    String brand;
    int cocoaPercentage;

    @Override
    public String toString() {
        return "Chocolate{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", cocoaPercentage=" + cocoaPercentage +
                '}';
    }

    public Chocolate(String name, String brand, int cocoaPercentage) {
        this.name = name;
        this.brand = brand;
        this.cocoaPercentage = cocoaPercentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCocoaPercentage() {
        return cocoaPercentage;
    }

    public void setCocoaPercentage(int cocoaPercentage) {
        this.cocoaPercentage = cocoaPercentage;
    }
}

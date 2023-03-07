public class Phone {
    String phoneNember;
    String brand;
    String model;



    @Override
    public String toString() {
        return "Phone{" +
                "phoneNember='" + phoneNember + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public void receiveCall (String name) {  //  сигнатура метода - это первая строчка
        System.out.println("Звонит: " + name);
    }

    public String getPhoneNember() {
    return phoneNember;
    }

    public Phone(String phoneNember, String brand, String model) {  // Alt + Insert = Generate -> Constractor
        this.phoneNember = phoneNember;
        this.brand = brand;
        this.model = model;
    }

    public void setPhoneNember(String phoneNember) {
        this.phoneNember = phoneNember;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

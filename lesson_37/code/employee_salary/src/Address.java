import java.util.SortedMap;

public class Address extends Employee {

    public Address(String name, String email, int ID_num, String address) {  // конструктор
        super(name, email, ID_num);
        this.address = address;
    }

    //System.out.println("Это ваш адрес: " + )
}

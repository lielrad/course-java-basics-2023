public class Person {
    String name; // имя человека, возможно с фамилией, модификатор по умолчанию = public
    protected int age; // возраст персоны, protected - ???
    public String address; // строка с адресом персоны, модификатор public
    private String phone; // строка с цифрами телефонного номера

    // конструктор
    public Person(String name, int age, String address, String phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }
    // метод (сделанный нами), который отображает на экране (консоли) имя персоны
    public void displayName() {
        System.out.printf("Name: %s \n", name); // формат отображения - имя встанет вместо буквы s,
        // \n - перенос на новую строку
    }

    // это метод, который отображает возраст персоны
    void displayAge() {
        System.out.printf("Age: %d \n", age); // %d - для чисел (digital)
    }

    // это метод, который отображает адрес персоны
    private void displayAddress() {
        System.out.printf("Address: %s \n", address);
    }

    protected void displayTelephone() {
        System.out.printf("Telephone: %s \n", phone);
    }





}

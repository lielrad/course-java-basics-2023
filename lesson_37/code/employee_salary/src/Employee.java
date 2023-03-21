public abstract class Employee {

    //    Задача 1. Создать класс Address, расширяющий класс Employee.
    //    Реализовать в нем конструктор и геттеры.
    //    В классе Main создать двух работников с адреcами, напечатаь в консоли их адреса.

        private String name; // это имя сотрудника, оно закрыто для прямого доступа из других классов
        private String email; // это почта сотрудника, оно закрыто для прямого доступа из других классов
        private int ID_num;  // это внутренний номер
        private String address;


    public Employee(String name, String email, int ID_num, String address) {
        this.name = name;
        this.email = email;
        this.ID_num = ID_num;
        this.address = address;
    }

    // метод для отправки информации
        public void mailPaySlip() {
        System.out.println("Это метод класса Employee");
        System.out.println("Уважаемый" + this.name + ", направляем информацию о зарплате на адрес " + this.email);
    }

    // метод переопределяет стандартный toString()
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", ID_num=" + ID_num +
                ", address='" + address + '\'' +
                '}';
    }

        // геттер
        public int getID_num() {
        return ID_num;
    }
    // геттер
    public String getName() {
        return name;
    }
    // геттер
    public String getEmail() {
        return email;
    }
    // геттер
    public String getAddress() {
        return address;
    }
}

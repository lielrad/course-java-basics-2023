public abstract class Employee_p {
    /*
    Шаг 1 - создаем абстрактный класс Employee Поля абстрактного класса Employee:

    Имя (Фамилия + Имя)
    e-mail
    внутренний учетный номер(ID)
    Методы:

    конструктор Employee для 3-х полей - имя, e-mail, ID
    назначаем годовую зарплату computeSalary (пока 0.0)
    отправляем работнику ежемесячно paySlip на e-mail
    печатаем данные о работнике (имя, ID, зарплата) методом toString
    геттер для имени работника
    геттер для e-mail адреса
    геттер для учетного номера
    Пробуем создать работника... Но это не получается (значения полей - null и 0), так как метод абстрактный и не может иметь конкретных экземпляров объекта.
    */

    String name;
    String mail;
    int ID;
    double compute_salary = 0.0;

    public void mailPaySlip() {
        System.out.println("Это метод класса Employee");
        System.out.println("Уважаемый" + this.name + ", направляем информацию о зарплате на адрес " + this.mail);
    }


    public Employee_p(String name, String mail, int ID) {
        this.name = name;
        this.mail = mail;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Employee_p{" +
                "name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", ID=" + ID +
                '}';
    }

    public double getCompute_salary() {
        return compute_salary;
    }
}

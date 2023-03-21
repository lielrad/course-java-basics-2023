public class Main {
    public static void main(String[] args) {

        System.out.println("=====================");
        System.out.println(" Работник и зарплата");
        System.out.println("=====================");
        System.out.println();


//         Нужно иметь "систему", в которой есть "Сотрудники", их "Зарплаты" и надо
//         уметь отправлять им письма по e-mail с информацией об их зарплате


        // так создать экземпляр Employee не получается. Ошибка:  java: Employee is abstract; cannot be instantiated
        //Employee emp1 = new Employee("Иванов Петр", "ivanov_p@mail.com", "101");

        // Создаем работника с зарплатой
        Salary s1 = new Salary("Иванов Петр", "ivanov_p@mail.com", 101, 60000);
        Salary s2 = new Salary("Петров Алексей", "petrov_a@mail.com", 101, 48000);

//        System.out.println(s1);
//        System.out.println(s2);

        System.out.println("вызываем метод mailPaySlip()");
        s1.mailPaySlip();
        s2.mailPaySlip();

        s2.setSalary(54000);
        s2.mailPaySlip();


    }
}
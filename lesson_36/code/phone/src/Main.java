public class Main {
    public static void main(String[] args) {

//        Создайте класс Phone, который содержит переменные number, brand и model.
//        Создайте три экземпляра этого класса.
//        Выведите на консоль значения их переменных методом toString.
//        Добавить в класс Phone метод: receiveCall, имеет один параметр – имя звонящего.
//        Выводит на консоль сообщение “Звонит name”.
//        Задайте метод getNumber – возвращает номер телефона.
//        Вызвать этот метод для каждого из объектов.
//        Добавить конструктор в класс Phone, который принимает на вход три параметра
//        для инициализации переменных класса - number, brand и model.
//        Добавить в класс setter и getter.

        System.out.println("Класс Телефон - практикум");

        Phone phone1 = new Phone("+7 926 814 7890", "Samsung", "A5"); // обращение к конструктору
        Phone phone2 = new Phone("+7 199 250 2863", "Samsung", "S20 FE"); // обращение к конструктору
        Phone phone3 = new Phone("+972 544 576 345", "Samsung", "Galaxy Note 5"); // обращение к конструктору

        System.out.println(phone1.toString());
        System.out.println(phone2.toString());
        System.out.println(phone3.toString());

        System.out.println(phone1.getModel());



//        Phone myPhone1 = new Phone();
//        myPhone1.phoneNember = "+7 926 814 7890";
//        myPhone1.brand = "Samsung";
//        myPhone1.model = "A5";
//
//       //         Samsung Galaxy S20 FE (SM-G780G)
//
//        Phone myPhone2 = new Phone();
//        myPhone2.phoneNember = "+7 199 250 2860";
//        myPhone2.brand = "Sumsung";
//        myPhone2.model = "S20 FE";
//
//        Phone myPhone3 = new Phone();
//        myPhone3.phoneNember = "+972 544 576 345";
//        myPhone3.brand = "Sumsung";
//        myPhone3.model = "Galaxy Note 5";
//
//        System.out.println(myPhone1.toString());
//        System.out.println(myPhone2.toString());
//        System.out.println(myPhone3.toString());
//
//        myPhone1.receiveCall("Мой приятель");
//        myPhone2.receiveCall("Моя мама");
//
//        System.out.println("Номер 1-го телефона: " + myPhone1.getPhoneNember());
//        System.out.println("Номер 2-го телефона: " + myPhone2.getPhoneNember());
//        System.out.println("Номер 3-го телефона: " + myPhone3.getPhoneNember());


//===================================================================================


//        Phone myPhone1 = new Phone(); // порождаем новый экземпляр класса
//        myPhone1.phoneNumber = "+7 903 123 45 67";
//        myPhone1.brand = "Samsung"; // задаем конкретные прараметры экземпляра
//        myPhone1.model = "A5"; // задаем конкретные прараметры экземпляра
//
//        Phone myPhone2 = new Phone(); // порождаем новый экземпляр класса
//        myPhone2.phoneNumber = "+49 152 666 777"; // задаем конкретные прараметры экземпляра
//        myPhone2.brand = "Apple"; // задаем конкретные прараметры экземпляра
//        myPhone2.model = "iPhone 11"; // задаем конкретные прараметры экземпляра
//
//        Phone myPhone3 = new Phone(); // порождаем новый экземпляр класса
//        myPhone3.phoneNumber = "+49 152 444 555"; // задаем конкретные прараметры экземпляра
//        myPhone3.brand = "Apple"; // задаем конкретные прараметры экземпляра
//        myPhone3.model = "iPhone 11"; // задаем конкретные прараметры экземпляра
//
//        System.out.println(myPhone1.toString());
//        System.out.println(myPhone2.toString());
//        System.out.println(myPhone3.toString());

//        myPhone1.receiveCall("Моя мама" );
//
//        System.out.println("Номер 1-го телефона: " + myPhone1.getPhoneNumber());
//        System.out.println("Номер 2-го телефона: " + myPhone2.getPhoneNumber());
//        System.out.println("Номер 3-го телефона: " + myPhone3.getPhoneNumber());

//
//        Phone phone1 = new Phone();
//        Phone phone2 = new Phone();
//        Phone phone3 = new Phone();
//
//        System.out.println(phone1.toString());
//        System.out.println(phone2.toString());
//        System.out.println(phone3.toString());
//
//        phone1.receiveCall("1234567");
//
//        String phoneNumber = phone1.getNumber();
//        System.out.println("Номер телефона: " + phoneNumber);


//        Phone phone1 = new Phone("+7903 123 45 67", "iPhone", 280);
//        Phone phone2 = new Phone("+49 176 00 000 123", "Samsung", 290);
//        Phone phone3 = new Phone("+49 152 00 000 321", "Sony", 250);
//
//        System.out.println(phone1.toString());
//        System.out.println(phone2.toString());
//        System.out.println(phone3.toString());
//
    }
}
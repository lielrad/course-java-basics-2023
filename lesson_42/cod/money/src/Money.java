
public class Money {

    private long amount; // переменная типа long - это целые числа
    private String currency; // название валюты - USD, EURO...

    // конструктор модифицированный
    public Money(double amount, String currency) { // переопределили тип переменной - double - чтобы можно было указать центы, копейки и т.д.
        this.amount = Math.round(amount * 100); // round - это округление до 100, т.е. считаем деньги сотнями
        this.currency = currency;
    }

    // переопределение метода toString
    @Override
    public String toString() { // это сигнатура (signature) метода, доступный, возвращает строку (String)
        return String.format("%.2f %s", amount / 100.0, currency.toUpperCase()); // вывод количества денег и названия валюты
    }

    // переопределяение метода equals
    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) {       // если объект obj является экземпляром класса Human
            return false;
        }
        Money that = (Money) obj;
        return this.amount == that.amount && this.currency.equalsIgnoreCase(that.currency);
    }
//    @Override // переопределение метода equals
//    public boolean equals(Object other) {
//        System.out.println("this: " + this); // проверили что такое this - почему печатает только amount?
//        System.out.println("other: " + other); // проверили что такое other
//        if (this == other) { // если этот элемент (объект? класс?) равен другому (передаваемому) объекту класса
//            return true;
//        }
//        if (!(other instanceof Money money)) { // Оператор instanceof проверяет, принадлежит ли объект к определённому классу.
//            return false; // если такой валюты нет, возвращаем false
//        }
//        return amount == money.amount && currency.equalsIgnoreCase(money.currency); //
//    }
}
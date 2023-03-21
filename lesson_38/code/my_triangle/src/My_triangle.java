public class My_triangle {
//    Задача о треугольнике: даны стороны треуголника a, b, с.
//    Ни одна из сторон трегольника не может быть длинее, чем сумма двух других.

    int a;
    int b;
    int c;


    public My_triangle (int a, int b, int c) {

    if ((a<b+c) && (b<a+c) && (c<a+b)) {
        System.out.println("Такой треугольник существует");
    } else {
        System.out.println("Такого треугольника не существует");
    }
    }



}

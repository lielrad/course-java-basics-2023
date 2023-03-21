public class Triangle {
    int a; // это 1-я сторона
    int b;// это 2-я сторона
    int c;// это 3-я сторона

    public Triangle(int a, int b, int c) {
        if ((a >= b + c) || (b >= a + c) || (c >= a + b)) {  //  ||  это неисключающее или
            System.out.println("Такой треугольник не существует");
        } else {
            this.a = a;
            this.b = b;
            this.c = c;
            System.out.println("Такой треугольник существует");
        }
    }
}

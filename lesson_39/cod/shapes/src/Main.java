public class Main {
    public static void main(String[] args) {

        System.out.println("Площади геометрических фигур");

        double r = 10;
        Circle o1 = new Circle("circle", r);
        double s_circle = o1.area(); // используем метод класса
        System.out.println("\nплощадь круга " + s_circle);

        double a = 100;
        double h_t = 200;
        Triangle t1 = new Triangle("trianglee", a, h_t);
        double a_triangle = t1.area();
        System.out.println("\nплощадь треугольника "+ a_triangle);

        double a_tz = 15;
        double b_tz = 11;
        double h_tz = 12;
        Trapezoid tz1 = new Trapezoid("trapezoid", a_tz, b_tz, h_tz);
        double tz_area = t1.area();
        System.out.println("\nплощадь трапеции " + tz_area);


    }
}
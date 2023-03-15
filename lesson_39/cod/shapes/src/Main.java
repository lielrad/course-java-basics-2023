public class Main {
    public static void main(String[] args) {

        System.out.println("\nПлощади геометрических фигур");

        System.out.println("\nСalculating the area of a circle.");
        double r = 15;
        Circle o1 = new Circle("circle", r);
        double circle_area = o1.area(); // используем метод класса
        System.out.println("площадь круга " + circle_area);

        System.out.println("\nСalculating the area of a triangle.");
        double a_t = 100;
        double h_t = 170;
        Triangle t1 = new Triangle("trianglee", a_t, h_t);
        double triangle_area = t1.area();
        System.out.println("площадь треугольника "+ triangle_area);

        System.out.println("\nСalculating the area of a trapezoid.");
        double a_tz = 16;
        double b_tz = 11;
        double h_tz = 12;
        Trapezoid tz1 = new Trapezoid("trapezoid", a_tz, b_tz, h_tz);
        double trapezoid_area = t1.area();
        System.out.println("площадь трапеции " + trapezoid_area);

        System.out.println("\nСalculating the area of a rectangle.");
        double a_rectangle = 20;
        double b_rectangle = 15;
        Rectangle rectangle1 = new Rectangle("rectangle", a_rectangle, b_rectangle);
        double rectangle_area = rectangle1.area();
        System.out.println("площадь прямоугольника " + rectangle_area);


    }
}
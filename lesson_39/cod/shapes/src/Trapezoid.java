public class Trapezoid extends Shape {

    double a;
    double b;
    double h;

    public Trapezoid(String name, double a, double b, double h) {
        super(name);
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public double area() {
        return (a + b) / 2 * h;
    }
}

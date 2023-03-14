public class Triangle extends Shape {

    double a; // длина основания
    double h; // высота, проведенная к этому основанию

    public Triangle(String name, double a, double h) {
        super(name);
        this.a = a;
        this.h = h;
    }

    @Override
    public double area() {
        return (a * h) / 2;
    }
}

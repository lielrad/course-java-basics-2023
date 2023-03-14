public class Circle extends Shape {

    double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double area() {
        return (Math.PI * radius * radius);  // PI - значение "пи"
    }
}

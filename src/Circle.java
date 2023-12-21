public class Circle extends Shape {
    protected double radius;

    public Circle() {
        radius = 10;
        color = "white";
        filled = false;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle of" + " radius -> " + radius + ", color" + color + " and its filled status of " + filled;
    }
}

package ss5_accessmodifier_staticmethod.bai_tap.circle;

public class Circle {
    private double radius  = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return this.radius * 2 * Math.PI;
    }
}

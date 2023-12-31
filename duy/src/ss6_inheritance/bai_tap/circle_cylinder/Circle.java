package ss6_inheritance.bai_tap.circle_cylinder;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius (double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}

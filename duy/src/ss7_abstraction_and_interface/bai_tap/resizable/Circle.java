package ss7_abstraction_and_interface.bai_tap.resizable;

public class Circle extends Shape {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Bán kính hình tròn:" + getRadius() + "\nLà lớp con của " + super.toString();
    }

    @Override
    public void resize(double percent) {
        setRadius(this.radius += percent);
    }
}


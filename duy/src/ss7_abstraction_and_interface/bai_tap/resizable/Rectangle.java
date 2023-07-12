package ss7_abstraction_and_interface.bai_tap.resizable;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "Chiều rộng hình chữ nhật:" + getWidth() + "\n Chiều dài hình chữ nhật:" + getLength() + "\n Là lớp con của " + super.toString();
    }

    @Override
    public void resize(double percent) {
        setLength(this.length += percent);
        setWidth(this.width += percent);
    }
}

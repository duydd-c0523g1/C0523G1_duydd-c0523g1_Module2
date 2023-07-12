package ss6_inheritance.bai_tap.circle_cylinder;

public class Cylinder extends Circle {
    private double height;
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return Math.PI * Math.pow(super.getRadius(),2) * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + super.getRadius() +
                ", color='" + super.getColor() + '\'' +
                '}';
    }
}


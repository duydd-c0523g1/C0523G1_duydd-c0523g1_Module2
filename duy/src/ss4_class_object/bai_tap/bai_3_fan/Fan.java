package ss4_class_object.bai_tap.bai_3_fan;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = 1;
    private boolean status = false;
    private double radius = 5;
    private String color = "blue";

    public Fan(int speed, boolean isOn, double radius, String color) {
        this.speed = speed;
        this.status = isOn;
        this.radius = radius;
        this.color = color;
    }
    public int getSpeed() {
        return speed;
    }
    public int setSpeed(int speed) {
        return this.speed;
    }
    public boolean getStatus() {
        return status;
    }
    public boolean setStatus(boolean status) {
        return this.status;
    }
    public double getRadius() {
        return radius;
    }
    public double setRadius(double radius) {
        return this.radius;
    }
    public String getColor() {
        return color;
    }
    public String setColor(String color) {
        return this.color;
    }

}

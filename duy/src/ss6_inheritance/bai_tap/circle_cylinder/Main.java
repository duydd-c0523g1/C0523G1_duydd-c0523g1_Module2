package ss6_inheritance.bai_tap.circle_cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Cylinder cylinder = new Cylinder();
        circle.setRadius(5.0);
        circle.setColor("blue");
        cylinder.setHeight(10);
        cylinder.setColor("red");
        cylinder.setRadius(5.0);
        System.out.println(circle);
        System.out.println(cylinder);
        System.out.println("Diện tích hình tròn:" + circle.getArea());
        System.out.println("Thể tích hình trụ:" + cylinder.getVolume());
    }
}

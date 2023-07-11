package ss5_accessmodifier_staticmethod.bai_tap.circle;

public class Main {
    public static void main(String[] args) {
            Circle circle1 = new Circle();
            Circle circle2 = new Circle(8);
            System.out.println(circle1.getRadius());
            System.out.println(circle1.getArea());
            System.out.println(circle2.getRadius());
            System.out.println(circle2.getArea());
        }
    }

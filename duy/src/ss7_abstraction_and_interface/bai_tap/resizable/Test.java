package ss7_abstraction_and_interface.bai_tap.resizable;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(10);
        shapes[1] = new Rectangle(5, 10);
        shapes[2] = new Square(5);
        for (Shape x : shapes) {
            System.out.println(x);
            if (x instanceof Circle) {
                System.out.println("Area Circle: ");
                System.out.println(((Circle) x).getArea());
            }
            if (x instanceof Rectangle) {
                System.out.println("Area Rectangle: ");
                System.out.println(((Rectangle) x).getArea());
            }
            if (x instanceof Square) {
                System.out.println("Area Square: ");
                System.out.println(((Square) x).getArea());
            }
        }
        double random = Math.random() * 100 + 1;
        for (Shape x : shapes) {
            System.out.println(x);
            if (x instanceof Circle) {
                x.resize(random);
                System.out.println("Circle Area: ");
                System.out.println(((Circle) x).getArea());
            }
            if (x instanceof Rectangle) {
                x.resize(random);
                System.out.println("Rectangle Area: ");
                System.out.println(((Rectangle) x).getArea());
            }
            if (x instanceof Square) {
                x.resize(random);
                System.out.println("Square Area: ");
                System.out.println(((Square) x).getArea());
            }
        }
    }
}

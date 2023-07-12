package ss7_abstraction_and_interface.bai_tap.colorable;

import ss7_abstraction_and_interface.bai_tap.resizable.Shape;
import ss7_abstraction_and_interface.bai_tap.resizable.Square;

public class Test {
    public static void main(String[] args) {
        Shape[] shape = new Shape[1];
        shape[0] = new Square(5);
        for (Shape x: shape) {
            System.out.println(x);
            if (x instanceof Colorable){
                Square square = (Square) x;
                System.out.println(square.getArea());
                square.howToColor();
            }
        }
    }
}

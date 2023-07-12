package ss7_abstraction_and_interface.bai_tap.resizable;

import ss7_abstraction_and_interface.bai_tap.colorable.Colorable;

public class Square extends Rectangle implements Colorable {
    private double side;

    public Square() {
        this.side = 1;

    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return (side * side);
    }

    public double getPerimeter() {
        return (side * 4);
    }

    @Override
    public String toString() {
        return "Square{" + "side=" + side + '}';
    }

    @Override
    public void resize(double percent) {
        setSide(this.side += percent);
    }


    @Override
    public void howToColor() {
    }

}

package ss6_inheritance.bai_tap.point_and_movable_point;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        MovablePoint movablePoint = new MovablePoint();
        point.setXY(2, 4);
        movablePoint.setXY(3, 5);
        movablePoint.setSpeed(5, 7);
        System.out.println(movablePoint);
        System.out.println(point);
        movablePoint.move();
    }
}
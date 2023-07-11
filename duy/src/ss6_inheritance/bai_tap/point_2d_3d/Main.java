package ss6_inheritance.bai_tap.point_2d_3d;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        Point3D point3D = new Point3D();
        point2D.setX(2);
        point2D.setY(4);
        point3D.setX(2);
        point3D.setY(4);
        point3D.setZ(6);
        System.out.println(point2D);
        System.out.println(point3D);

    }
}

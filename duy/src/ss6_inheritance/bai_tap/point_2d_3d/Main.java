package ss6_inheritance.bai_tap.point_2d_3d;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        Point3D point3D = new Point3D();
        point2D.setXY(2, 5);
        point3D.setXYZ(4, 6, 7);
        System.out.println(point2D);
        System.out.println(point3D);

    }
}

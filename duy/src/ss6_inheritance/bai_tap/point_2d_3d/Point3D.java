package ss6_inheritance.bai_tap.point_2d_3d;

public class Point3D extends Point2D {
    public float z;

    public Point3D(float x, float y, float z) {
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float[] getXYZ() {

        return new float[]{this.x, this.y, this.z};
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + x +
                ", x=" + y +
                ", y=" + z +
                '}';
    }
}

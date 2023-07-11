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

    public void setXYZ(float x, float Y, float z) {
    }

    public float[] getXYZ() {
        float[] xyz = new float[3];
        return xyz;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}

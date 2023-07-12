package ss6_inheritance.bai_tap.point_and_movable_point;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
    }

    public MovablePoint(float xSpeed,float ySpeed) {
    }
    public MovablePoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void  setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() {
        return new float[]{this.xSpeed, this.ySpeed};
    }

    @Override
    public String toString() {
        return super.getX() + ", " +  super.getY() + ", " + "speed = " + "(" + xSpeed + ", " + ySpeed + ")";
    }
    public MovablePoint move() {
        x += xSpeed;
        y += ySpeed;
        return this;
    }
}

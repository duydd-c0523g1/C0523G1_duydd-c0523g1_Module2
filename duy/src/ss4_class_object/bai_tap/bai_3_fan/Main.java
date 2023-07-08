package ss4_class_object.bai_tap.bai_3_fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setStatus(true);
        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setStatus(false);
        System.out.println("Quạt 1: " + fan1.getSpeed());
        System.out.println("Quạt 1: " + fan1.getRadius());
        System.out.println("Quạt 1: " + fan1.getColor());
        System.out.println("Quạt 1: " + fan1.getStatus());
        System.out.println("Quạt 2: " + fan2.getSpeed());
        System.out.println("Quạt 2: " + fan2.getRadius());
        System.out.println("Quạt 2: " + fan2.getColor());
        System.out.println("Quạt 2: " + fan2.getStatus());
    }
}

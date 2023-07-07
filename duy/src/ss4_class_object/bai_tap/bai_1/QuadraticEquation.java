package ss4_class_object.bai_tap.bai_1;

public class QuadraticEquation {
    private double numA;
    private double numB;
    private double numC;


    public QuadraticEquation(double numA, double numB, double numC) {
        this.numA = numA;
        this.numB = numB;
        this.numC = numC;
    }

    public double getNumA() {
        return numA;
    }

    public double getNumB() {
        return numB;
    }

    public double getNumC() {
        return numC;
    }

    public double getDiscriminant() {
        return Math.pow(numB, 2) - 4 * numA * numC;
    }

    public double getRoot1() {
        double discriminant = getDiscriminant();
        if (discriminant > 0) {

            return (-numB + Math.sqrt(discriminant)) / (numA * 2);

        } else {
            System.out.println("Phương trình vô nghiệm");
        }
        return discriminant;
    }

    public double getRoot2() {
        double discriminant = getDiscriminant();
        if (discriminant > 0) {

            return (-numB + Math.sqrt(discriminant)) / (numA * 2);

        } else {
            System.out.println("Phương trình vô nghiệm");
        }
        return discriminant;
    }
}
package B4_LopVaDoiTuongTrongJava.BT1_XayDungLopQuadraticEquation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    double getDiscriminant() {
        return this.b * 2 - this.a * this.c * 4;
    }

    double getRoot1() {
        return ((-1 * this.b + Math.sqrt(getDiscriminant())) / (2 * this.a));
    }

    double getRoot2() {
        return ((-1 * this.b - Math.sqrt(getDiscriminant())) / (2 * this.a));
    }
}

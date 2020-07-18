package B6_KeThua.BT1_LopCircleVaLopCylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double getArea() {
        return super.getArea() + 2 * Math.PI + this.radius + this.height;
    }

    @Override
    public String toString() {
        return this.radius + " " + this.color + " " + this.height + " " + this.getArea();
    }
}

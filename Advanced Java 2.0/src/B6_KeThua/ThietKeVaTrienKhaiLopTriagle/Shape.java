package B6_KeThua.ThietKeVaTrienKhaiLopTriagle;

public abstract class Shape {
    protected String color;

    public Shape() {

    }

    public Shape(String color) {
        this.color = color;
    }

    protected abstract double getArea();
    protected abstract double getPerimeter();
}

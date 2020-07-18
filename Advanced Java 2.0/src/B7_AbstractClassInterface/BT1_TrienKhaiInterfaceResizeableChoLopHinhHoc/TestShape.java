package B7_AbstractClassInterface.BT1_TrienKhaiInterfaceResizeableChoLopHinhHoc;

public class TestShape {
    public static void main(String[] args) {
        Shape[] shapeArray = new Shape[]{
                new Circle(3),
                new Rectangle(4, 5),
                new Square(6)
        };

        System.out.println("Before:");
        for (Shape s : shapeArray) {
            if (s instanceof Circle) {
                Circle c = (Circle) s;
                System.out.println("Circle: " + c.getArea());
            } else if (s instanceof Square) {
                Square sq = (Square) s;
                System.out.println("Square: " + sq.getArea());
            } else if (s instanceof Rectangle) {
                Rectangle r = (Rectangle) s;
                System.out.println("Rectangle: " + r.getArea());
            }
        }

        for (Shape s : shapeArray) {
            int ran1To100 = (int) (Math.random() * 100 + 1);
            if (s instanceof Circle) {
                Circle c = (Circle) s;
                c.resize(ran1To100);
            } else if (s instanceof Square) {
                Square sq = (Square) s;
                sq.resize(ran1To100);
            } else if (s instanceof Rectangle) {
                Rectangle r = (Rectangle) s;
                r.resize(ran1To100);
            }
        }

        System.out.println("After:");
        for (Shape s : shapeArray) {
            if (s instanceof Circle) {
                Circle c = (Circle) s;
                System.out.println("Circle: " + c.getArea());
            } else if (s instanceof Square) {
                Square sq = (Square) s;
                System.out.println("Square: " + sq.getArea());
            } else if (s instanceof Rectangle) {
                Rectangle r = (Rectangle) s;
                System.out.println("Rectangle: " + r.getArea());
            }
        }
    }
}

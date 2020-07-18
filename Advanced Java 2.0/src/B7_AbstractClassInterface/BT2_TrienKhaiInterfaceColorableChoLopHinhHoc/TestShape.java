package B7_AbstractClassInterface.BT2_TrienKhaiInterfaceColorableChoLopHinhHoc;

public class TestShape {
    public static void main(String[] args) {
        Shape[] shapeArray = new Shape[]{
                new Circle(3),
                new Rectangle(4, 5),
                new Square(6)
        };

        System.out.println("Display Colorable: ");
        for (Shape s : shapeArray) {
            if (s instanceof Circle) {
                Circle c = (Circle) s;
                System.out.println("Circle: " + c.getArea());
            } else if (s instanceof Colorable){
                Square sq = (Square) s;
                System.out.print("Square: ");
                sq.howToColor();
            } else if (s instanceof Rectangle) {
                Rectangle r = (Rectangle) s;
                System.out.println("Rectangle: " + r.getArea());
            }
        }
    }
}

package B6_KeThua.BT2_LopPoint2DVaLopPoint3D;

public class TestPoint {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2, 3);
        System.out.println("Before 2D: " + point2D.toString());
        point2D.setXY(8, 9);
        System.out.println("After 2D: " + point2D.toString());

        Point3D point3D = new Point3D(4, 5, 6);
        System.out.println("Before 3D: " + point3D.toString());
        point3D.setXYZ(1, 2, 3);
        System.out.println("After 3D: " + point3D.toString());
    }
}

package B6_KeThua.BT3_LopPointVaMovealePoint;

public class TestPoint {
    public static void main(String[] args) {
        Point p = new Point(1, 2);
        System.out.println("Point: " + p.toString());

        MoveablePoint mPoint = new MoveablePoint(3, 4, 5, 6);
        System.out.println("Movable Point (before): " + mPoint.toString());
        mPoint.move();
        System.out.println("Movable Point (after): " + mPoint.toString());
    }
}

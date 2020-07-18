package B6_KeThua.ThietKeVaTrienKhaiLopTriagle;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input color: ");
        String color = scanner.nextLine();

        System.out.println("Please input 3 sides: ");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        Triangle triangle = new Triangle(color, side1, side2, side3);

        System.out.println("Triangle: " + triangle.toString());
    }
}

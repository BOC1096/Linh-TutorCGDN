package B15_XuLyNgoaiLeVaDebug.BT_SuDungLopIllegalTriangleException;

import java.util.Scanner;

public class UseIllegalTriangleException {

    public boolean isValidTriangle(int a, int b, int c) throws IllegalTriangleException {
        if ((a < 0) || (b < 0) || (c < 0) || ((a + b) < c) || ((a + c) < b) || ((b + c) < a)) {
            throw new IllegalTriangleException();
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UseIllegalTriangleException useException = new UseIllegalTriangleException();

        System.out.println("Input a: ");
        int a = scanner.nextInt();
        System.out.println("Input b: ");
        int b = scanner.nextInt();
        System.out.println("Input c: ");
        int c = scanner.nextInt();

        try {
            if (useException.isValidTriangle(a, b, c)) {
                System.out.println("Triangle is valid.");
            } else {
                System.out.println("Triangle is invalid.");
            }
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        }
    }
}

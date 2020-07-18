package B3_MangVaPhuongThucTrongJava.BT6_TinhTongCacSoOCotXacDinh;

import B3_MangVaPhuongThucTrongJava.BT4_TimPhanTuLonNhatTrongMangHaiChieu.MaxElement;

import java.util.Arrays;
import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double val;
        System.out.print("nhap so dong: ");
        int size1 = input.nextInt();
        System.out.print("nhap so cot: ");
        int size2 = input.nextInt();
        double[][] array = new double[size1][size2];
        MaxElement.themPhanTu(input, size1, size2, array);
        for (double[] doubles : array) {
            System.out.println(Arrays.toString(doubles));
        }
        System.out.println("Nhap cot muon tinh tong");
        int column = input.nextInt();
        System.out.println("Tong cua cot " + column + " la: " + tinhTongCot(array, column));
    }

    private static double tinhTongCot(double[][] arr, int column) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i][column];
        }
        return total;
    }
}

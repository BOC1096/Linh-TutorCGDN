package B3_MangVaPhuongThucTrongJava.BT5_TimPhanTuNhoNhatTrongMang;

import B3_MangVaPhuongThucTrongJava.BT3_GopMang.AddArray;

import java.util.Arrays;
import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        int[] array;
        System.out.print("nhap do dai mang: ");
        size = input.nextInt();
        array = new int[size];
        AddArray.nhapMang(size, array);
        System.out.print("mang la: ");
        System.out.println(Arrays.toString(array));
        System.out.println("Phan tu co gia tri nho nhat la: " + timGiaTriMin(array));
    }

    static int timGiaTriMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}

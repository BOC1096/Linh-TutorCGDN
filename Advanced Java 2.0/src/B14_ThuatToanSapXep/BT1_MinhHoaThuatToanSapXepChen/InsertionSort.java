package B14_ThuatToanSapXep.BT1_MinhHoaThuatToanSapXepChen;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int currentElement = array[i];
            System.out.println("Curent element: " + currentElement);
            int j;
            for (j = i - 1; j >= 0 && array[j] > currentElement; j--) {
                System.out.println("For j: ");
                array[j + 1] = array[j];
                System.out.println(Arrays.toString(array));
            }
            array[j + 1] = currentElement;
            System.out.println("Result " + currentElement + ": ");
            System.out.println(Arrays.toString(array));
        }
    }

    public static void main(String[] args) {
        int[] a = {9, 8, 1, 3, 2};
        insertionSort(a);
    }
}

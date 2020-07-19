package B14_ThuatToanTimKiem.BT2_CaiDatThuatToanChen;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int iMin = i;
            int min = array[i];

            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    iMin = j;
                }
            }

            if (iMin != i) {
                array[iMin] = array[i];
                array[i] = min;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {9, 8, 1, 3, 2};
        selectionSort(a);
        System.out.println(Arrays.toString(a));
    }
}

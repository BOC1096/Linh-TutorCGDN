package B13_ThuatToanTimKiem.BT1_CaiDatThuatToanTimKiemNhiPhanSuDungDeQuy;

public class BinarySearch {
    public static int binarySearch(int arr[], int left, int right, int x) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                return mid;
            }else if (arr[mid] > x) {
                return binarySearch(arr, left, mid - 1, x);
            } else return binarySearch(arr, mid + 1, right, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 10, 40};
        int x = 2;
        int result = binarySearch(arr, 0, arr.length - 1, x);
        if (result != -1) {
            System.out.println("Index of "+x+" is "+result);
        } else {
            System.out.println("Not found");
        }
    }
}

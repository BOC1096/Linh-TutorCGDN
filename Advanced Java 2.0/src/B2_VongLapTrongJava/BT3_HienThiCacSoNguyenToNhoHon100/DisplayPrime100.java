package B2_VongLapTrongJava.BT3_HienThiCacSoNguyenToNhoHon100;

public class DisplayPrime100 {
    private static boolean checkPrime(int num) {
        boolean check = true;
        if (num < 2) {
            check = false;
        } else {
            int i = 2;
            while (i <= Math.sqrt(num)) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        for (int number = 0; number < 100; number++) {
            if (checkPrime(number)) {
                System.out.println(number);
            }
        }
    }
}

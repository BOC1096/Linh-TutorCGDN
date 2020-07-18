package B4_LopVaDoiTuongTrongJava.BT2.XayDungLopStopWatch;

import java.util.Arrays;

public class StopWatchMain {
    public static void main(String[] args) {
        int[] number = new int[100000];
        for (int i = 0; i < number.length; i++) {
            number[i] = (int) (Math.random() * 100000 + 1);
        }
        StopWatch st1 = new StopWatch();
        st1.start();
        Arrays.sort(number);
        st1.stop();
        System.out.println(st1.getElapsedTime());
    }
}

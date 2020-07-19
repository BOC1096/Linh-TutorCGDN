package B11_DSA_StackQueue.BT3_ChuyenDoiTuHeThapPhanSangNhiPhan;

import java.util.Stack;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {
        int decNumber = 13;
        Stack<Integer> stackInt = new Stack<Integer>();

        while (decNumber != 0) {
            stackInt.push(decNumber % 2);
            decNumber /= 2;
        }

        StringBuffer buffer = new StringBuffer();
        while(!stackInt.isEmpty()) {
            buffer.append(stackInt.pop());
        }

        System.out.println("Binary number: " + buffer.toString());
    }
}

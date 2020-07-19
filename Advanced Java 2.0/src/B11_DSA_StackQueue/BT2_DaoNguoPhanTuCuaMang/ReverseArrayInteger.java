package B11_DSA_StackQueue.BT2_DaoNguoPhanTuCuaMang;

import java.util.Arrays;
import java.util.Stack;

public class ReverseArrayInteger {
    public static void main(String[] args) {
        int[] arrInt = {1, 2, 3, 4, 5, 6};
        Stack<Integer> stackInt = new Stack<Integer>();

        for (int i = 0; i < arrInt.length; i++) {
            stackInt.push(arrInt[i]);
        }

        int iStack = 0;
        int stackSize = stackInt.size();
        while(iStack < stackSize) {
             arrInt[iStack++] = stackInt.pop();
        }

         System.out.println("Array: " + Arrays.toString(arrInt));
    }
}

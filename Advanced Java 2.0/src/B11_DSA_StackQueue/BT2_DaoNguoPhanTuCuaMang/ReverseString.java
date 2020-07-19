package B11_DSA_StackQueue.BT2_DaoNguoPhanTuCuaMang;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String word = "Hello world!";
        Stack<Character> stackChar = new Stack<Character>();

        for (int i = 0; i < word.length(); i++) {
            stackChar.push(word.charAt(i));
        }

        char[] wordArray = new char[word.length()];
        int iStack = 0;
        int stackSize = stackChar.size();
        while(iStack < stackSize) {
            wordArray[iStack++] = stackChar.pop();
        }

        System.out.println("String: " + String.valueOf(wordArray));
    }
}

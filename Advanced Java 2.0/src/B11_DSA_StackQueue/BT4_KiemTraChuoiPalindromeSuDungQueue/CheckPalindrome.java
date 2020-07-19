package B11_DSA_StackQueue.BT4_KiemTraChuoiPalindromeSuDungQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CheckPalindrome {
    public static void main(String[] args) {
        String word = "Able was I ere I saw Elba";
        word = word.toLowerCase();
        Stack<Character> stackChar = new Stack<Character>();
        Queue<Character> queueChar = new LinkedList<Character>();

        for (int i = 0; i < word.length(); i++) {
            stackChar.push(word.charAt(i));
            queueChar.offer(word.charAt(i));
        }

        boolean isPalindrome = true;
        while(!stackChar.isEmpty() && !queueChar.isEmpty()) {
            if (stackChar.pop().charValue() != queueChar.poll().charValue()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}

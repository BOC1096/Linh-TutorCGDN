package B11_DSA_StackQueue.BT5_KiemTraDauNgoacTrongBieuThucSuDungStack;

import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {
        String expression = "s * (s – a) * s – b) * (s – c)";

        if (isFullBracket(expression)) {
            System.out.println("Well");
        } else {
            System.out.println("???");
        }
    }

    private static boolean isFullBracket(String expression) {
        Stack<Character> bStack = new Stack<Character>();

        for (int i = 0; i < expression.length(); i++) {
            char sym = expression.charAt(i);
            if (sym == '(') {
                bStack.push(sym);
            } else if (sym == ')') {
                if (bStack.isEmpty()) {
                    return false;
                } else {
                    bStack.pop();
                }
            }
        }

        if (!bStack.isEmpty()) {
            return false;
        }

        return true;
    }
}

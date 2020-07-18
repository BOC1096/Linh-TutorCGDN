package B9_AutomatedTestingTDD.BT3_FizzBuzz;

public class FizzBuzzTranslate {
    public static String translate(int N) {
        if (isaBoolean(N)) {
            if (N % 10 == 3){
                return "Fizz";
            }else if (N % 10 != 3){
                int a = (int) (N / 10);
                if (a == 3){
                    return "Fizz";
                }else if (a == 5){
                    return "Buzz";
                }
            }
            if (N % 3 == 0 && N % 5 != 0){
                return "Fizz";
            }else if(N % 5 == 0 && N %3 != 0){
                return "Buzz";
            }else if (N % 3 == 0){
                return "FizzBuzz";
            }else {
                return "Hello";
            }
        }
        return "Kiem tra lai";
    }

    private static boolean isaBoolean(int N) {
        return N > 0;
    }
}

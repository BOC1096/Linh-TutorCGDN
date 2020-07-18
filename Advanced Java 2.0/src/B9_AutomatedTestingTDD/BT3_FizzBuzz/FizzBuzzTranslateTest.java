package B9_AutomatedTestingTDD.BT3_FizzBuzz;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTranslateTest {
    @Test
    @DisplayName("N > 0")
    void translate() {
        int N = 1;
        String expected = "Hello";
        String result = FizzBuzzTranslate.translate(N);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Chia het cho 3")
    void translate1() {
        int N = 6;
        String expected = "Fizz";
        String result = FizzBuzzTranslate.translate(N);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Chia het cho 5")
    void translate2() {
        int N = 10;
        String expected = "Buzz";
        String result = FizzBuzzTranslate.translate(N);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Chia het cho 3 va 5")
    void translate3() {
        int N = 15;
        String expected = "FizzBuzz";
        String result = FizzBuzzTranslate.translate(N);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("nho hon 0")
    void translate4() {
        int N = -10;
        String expected = "Kiem tra lai";
        String result = FizzBuzzTranslate.translate(N);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("chua so 3")
    void translate5() {
        int N = 13;
        String expected = "Fizz";
        String result = FizzBuzzTranslate.translate(N);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("chua so 3 nhung chia lay du ko bang 3")
    void translate6() {
        int N = 31;
        String expected = "Fizz";
        String result = FizzBuzzTranslate.translate(N);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("chua so 5")
    void translate7() {
        int N = 51;
        String expected = "Buzz";
        String result = FizzBuzzTranslate.translate(N);
        assertEquals(expected, result);
    }
}

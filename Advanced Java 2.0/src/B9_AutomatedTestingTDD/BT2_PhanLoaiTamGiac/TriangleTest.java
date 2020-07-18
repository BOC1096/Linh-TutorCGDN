package B9_AutomatedTestingTDD.BT2_PhanLoaiTamGiac;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
public class TriangleTest {
    @Test
    @DisplayName("2-2-2")
    void triangleClassifier() {
        int side1 = 2;
        int side2 = 2;
        int side3 = 2;
        String expected = "Tam giac deu";
        String result = TriangleClassifirer.triangleClassifier(side1, side2, side3);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("2-2-3")
    void testTriangleClassifier() {
        int side1 = 2;
        int side2 = 2;
        int side3 = 3;
        String expected = "Tam giac can";
        String result = TriangleClassifirer.triangleClassifier(side1, side2, side3);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Tam giac thuong")
    void testTriangleClassifier2() {
        int side1 = 3;
        int side2 = 4;
        int side3 = 5;
        String expected = "Tam giac thuong";
        String result = TriangleClassifirer.triangleClassifier(side1, side2, side3);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Khong phai tam giac")
    void testTriangleClassifier3() {
        int side1 = 8;
        int side2 = 2;
        int side3 = 3;
        String expected = "khong phai tam giac";
        String result = TriangleClassifirer.triangleClassifier(side1, side2, side3);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("khong phai tam giac")
    void testTriangleClassifier4() {
        int side1 = -1;
        int side2 = 2;
        int side3 = 1;
        String expected = "khong phai tam giac";
        String result = TriangleClassifirer.triangleClassifier(side1, side2, side3);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("khong phai tam giac")
    void testTriangleClassifier5() {
        int side1 = 0;
        int side2 = 1;
        int side3 = 1;
        String expected = "khong phai tam giac";
        String result = TriangleClassifirer.triangleClassifier(side1, side2, side3);
        assertEquals(expected, result);
    }
}

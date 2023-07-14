package ss09_tdd.exercise;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleClassifierTest {
    @Test
    public void testTriangleClassifierTest() {
        double side1 = 2;
        double side2 = 2;
        double side3 = 200;
        String expectedResult = "Khong phai la ba canh cua mot tam giac";
        String result = TriangleClassifier.triangleClassifier(side1, side2, side3);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testTriangleClassifierTest1() {
        double side1 = 2;
        double side2 = 2;
        double side3 = 2;
        String expectedResult = "Tam giac deu";
        String result = TriangleClassifier.triangleClassifier(side1, side2, side3);
        assertEquals(expectedResult, result);
    }
    @Test
    public void testTriangleClassifierTest2() {
        double side1 = 3;
        double side2 = 4;
        double side3 = 5;
        String expectedResult = "Tam giac thuong";
        String result = TriangleClassifier.triangleClassifier(side1, side2, side3);
        assertEquals(expectedResult, result);
    }
    @Test
    public void testTriangleClassifierTest3() {
        double side1 = 0;
        double side2 = 1;
        double side3 = 1;
        String expectedResult = "Canh cua tam giac phai > 0";
        String result = TriangleClassifier.triangleClassifier(side1, side2, side3);
        assertEquals(expectedResult, result);
    }
    @Test
    public void testTriangleClassifierTest4() {
        double side1 = 2;
        double side2 = 2;
        double side3 = 3;
        String expectedResult = "Tam giac can";
        String result = TriangleClassifier.triangleClassifier(side1, side2, side3);
        assertEquals(expectedResult, result);
    }
}
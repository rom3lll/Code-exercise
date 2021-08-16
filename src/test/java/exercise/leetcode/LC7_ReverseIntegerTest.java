package exercise.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static exercise.leetcode.LC7_ReverseInteger.reverse;


public class LC7_ReverseIntegerTest {

    public static Object[][] testData() {
        return new Object[][]{
                {123, 321},
                {-123, -321}
        };
    }

    @ParameterizedTest
    @MethodSource("testData")
    public void reverseDataTest(int value, int expectedValue) {
        int actualResult = reverse(value);
        int expectedResult = expectedValue;
        Assertions.assertEquals(expectedResult, actualResult);
    }


}

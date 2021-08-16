package exercise.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class LC9_PalindromeNumberTest {

    public boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        }
        if (x < 0) {
            return false;
        }
        int originalNumber = x;
        long reversedNumber = 0;
        while (x != 0) {
            int lastDigit = x % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            x = x / 10;
        }
        if (reversedNumber > Integer.MAX_VALUE || reversedNumber < Integer.MIN_VALUE) {
            return false;
        } else {
            return (originalNumber == reversedNumber) ? true : false;
        }
    }

    public static Object[][] testData() {
        return new Object[][]{
                {121, true},
                {-121, false},
                {10, false},
                {-101, false}
        };
    }

    @Test
    public void Should_CheckPalindromeNumber() {
        boolean actualResult = isPalindrome(121);
        boolean expectedResult = true;
        Assertions.assertEquals(expectedResult, actualResult, "Error");

    }

    @ParameterizedTest
    @MethodSource("testData")
    public void Should_CheckPalindromeNumber2(int value, boolean expectedValue) {
        boolean actualResult = isPalindrome(value);
        boolean expectedResult = expectedValue;
        Assertions.assertEquals(expectedResult, actualResult, "Error");

    }


}

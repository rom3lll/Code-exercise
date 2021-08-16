package exercise.leetcode;

public class LC7_ReverseInteger {

    public static int reverse(int x) {
        if (x == 0) {
            return 0;
        }
        long reverse = 0;
        while (x != 0) {
            int lastDigit = x % 10;
            reverse = reverse * 10 + lastDigit;
            x = x / 10;
        }
        if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
            return 0;
        } else {
            return (int) reverse;
        }
    }

    private static boolean checkValue(int x) {
        return (x >= 0) ? true : false;
    }

    public static int reverseTwo(int x) {
        boolean flag = true;
        if (!checkValue(x)) {
            x = x * -1;
            flag = false;
        }
        String reversed = "0";
        while (x != 0) {
            int lastDigit = x % 10;
            reversed += Integer.toString(lastDigit);
            x = x / 10;
        }
        return (flag) ? Integer.parseInt(reversed) : Integer.parseInt("-" + reversed);
    }




}

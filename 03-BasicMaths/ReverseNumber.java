// You are given an integer n. Return the integer formed by placing the digits of n in reverse order.
// Example 1
// Input: n = 25
// Output: 52
// Explanation: Reverse of 25 is 52.

// Example 2
// Input: n = 123
// Output: 321
// Explanation: Reverse of 123 is 321.

// Constraints
// 0 <= n <= 5000
// n will contain no leading zeroes except when it is 0 itself.

public class ReverseNumber {

    public static void main(String[] args) {
        System.out.println(reverseNumber(0));
    }

    public static int reverseNumber(int n) {
        if (n == 0)
            return 0;

        int rev = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n /= 10;
        }
        return rev;
    }
}
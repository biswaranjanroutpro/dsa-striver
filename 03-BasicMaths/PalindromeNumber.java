/*You are given an integer n. You need to check whether the number is a palindrome number or not. Return true if it's a palindrome number, otherwise return false.

A palindrome number is a number which reads the same both left to right and right to left.

Example 1
Input: n = 121
Output: true
Explanation: When read from left to right : 121.
When read from right to left : 121.

Example 2
Input: n = 123
Output: false
Explanation: When read from left to right : 123.
When read from right to left : 321. */

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1));
    }

    public static boolean isPalindrome(int n) {
        if (n < 0)
            return false;

        int original = n;
        int reverse = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            reverse = (reverse * 10) + lastDigit;
            n /= 10;
        }

        return original == reverse;
    }
}
// You are given two integers n1 and n2. You need find the Greatest Common Divisor (GCD) of the two given numbers. Return the GCD of the two numbers.

// The Greatest Common Divisor (GCD) of two integers is the largest positive integer that divides both of the integers.

// Example 1
// Input: n1 = 4, n2 = 6
// Output: 2
// Explanation: Divisors of n1 = 1, 2, 4, Divisors of n2 = 1, 2, 3, 6

// Greatest Common divisor = 2.
// Example 2
// Input: n1 = 9, n2 = 8
// Output: 1
// Explanation: Divisors of n1 = 1, 3, 9 Divisors of n2 = 1, 2, 4, 8.
// Greatest Common divisor = 1.

public class GcdOfTwo {

    public static void main(String[] args) {
        System.out.println(GCD(18, 12));
    }

    // Brute force
    public static int GCD(int n1, int n2) {
        // Initialize gcd to 1
        int gcd = 1;

        // Iterate from 1 up to
        // the minimum of n1 and n2
        for (int i = 1; i <= Math.min(n1, n2); i++) {
            // Check if i is a common
            // factor of both n1 and n2
            if (n1 % i == 0 && n2 % i == 0) {
                // Update gcd to the
                // current common factor i
                gcd = i;
            }
        }

        // Return the greatest
        // common divisor (gcd)
        return gcd;

    }
}
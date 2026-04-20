/*
Problem:
Given two integers low and high, return the sum of all integers
from low to high inclusive.

Example:
Input: low = 1, high = 5
Output: 15

Approach:
Use a loop from low to high and keep adding values.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class ForLoop {

    public static void main(String[] args) {
        System.out.println(sumRange(1, 5)); // 15
        System.out.println(sumRange(3, 7)); // 25
    }

    public static int sumRange(int low, int high) {
        int sum = 0;

        for (int i = low; i <= high; i++) {
            sum += i;
        }

        return sum;
    }
}
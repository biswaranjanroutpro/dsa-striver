/*
Problem:
Find sum of first 50 positive integers ending with digit d.

Approach:
Start from first positive number ending with d.
Keep adding 10 each time.
Repeat 50 times.

Time Complexity: O(50) = O(1)
Space Complexity: O(1)
*/

import java.util.*;

public class WhileLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int d = sc.nextInt();
        System.out.println(sumEndingDigit(d));

        sc.close();
    }

    public static int sumEndingDigit(int d) {

        int sum = 0;
        int count = 0;

        int number = (d == 0) ? 10 : d;

        while (count < 50) {
            sum += number;
            number += 10;
            count++;
        }

        return sum;
    }
}
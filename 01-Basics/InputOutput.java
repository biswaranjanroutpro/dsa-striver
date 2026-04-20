/*
Problem: Input Output

Task:
Take an integer as input and print it.

Approach:
1. Read integer using Scanner.
2. Pass it to solution().
3. Print the number.

Time Complexity: O(1)
Space Complexity: O(1)
*/

import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        solution(num);

        sc.close();
    }

    public static void solution(int number) {
        System.out.println(number);
    }
}
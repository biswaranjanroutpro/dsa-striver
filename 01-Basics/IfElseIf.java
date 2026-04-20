/*
Problem: If Else If

Task:
Take marks as input and print grade.

A : 90+
B : 70-89
C : 50-69
D : 35-49
Fail : below 35

Time Complexity: O(1)
Space Complexity: O(1)
*/

import java.util.*;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("A");
        } else if (marks >= 70) {
            System.out.println("B");
        } else if (marks >= 50) {
            System.out.println("C");
        } else if (marks >= 35) {
            System.out.println("D");
        } else {
            System.out.println("Fail");
        }

        sc.close();
    }
}
/*
Problem: Switch Case

Task:
Input day number (1-7) and print weekday.

1 -> MONDAY
2 -> TUESDAY
...
7 -> SUNDAY

Time Complexity: O(1)
Space Complexity: O(1)
*/

import java.util.*;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        whichWeekDay(day);

        sc.close();
    }

    public static void whichWeekDay(int day) {
        switch (day) {
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
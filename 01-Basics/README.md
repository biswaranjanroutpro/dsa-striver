# Question 1

Complete the function printNumber which takes an integer input from the user and prints it on the screen.

Example 1

Input(user gives value): 7

Output: 7

Example 2

Input(user gives value): -5

Output: -5

# Question 2

Given marks of a student, print on the screen:

Grade A if marks >= 90
Grade B if marks >= 70
Grade C if marks >= 50
Grade D if marks >= 35
Fail, otherwise.

Example 1

Input: marks = 95

Output: Grade A

Explanation: marks are greater than or equal to 90.

Example 2

Input: marks = 14

Output: Fail

Explanation: marks are less than 35.

# Question 3

Given the integer day denoting the day number, print on the screen which day of the week it is. Week starts from Monday and for values greater than 7 or less than 1, print Invalid.

Ensure only the 1st letter of the answer is capitalised.

Example 1

Input: day = 3

Output: Wednesday

Example 2

Input: day = 8

Output: Invalid

# Question 4

Given two integers low and high, return the sum of all integers from low to high inclusive.

Example 1

Input: low = 1, high = 5

Output: 15

Explanation: 1 + 2 + 3 + 4 + 5 = 15

Example 2

Input: low = 3, high = 7

Output: 25

Explanation: 3 + 4 + 5 + 6 + 7 = 25

# Question 5

Given a digit d (0 to 9), find the sum of the first 50 positive integers (integers > 0) that end with digit d.

A number ends with digit d if its last digit is d.

Example 1

Input: d = 1

Output: 12300

Explanation:

The first 50 positive integers ending with 1 are: 1, 11, 21, 31, ..., 491

Their sum is 12300.

Example 2

Input: d = 5

Output: 12450

formula: Sn = n/2[2a + (n-1) * d]
Where:

n = 50
a = first term
d = 10

```java
// optimal solution
public static int sumEndingDigit(int digit) {
    int a = (digit == 0) ? 10 : digit;
    return (50 * (2 * a + 49 * 10)) / 2;
}
```

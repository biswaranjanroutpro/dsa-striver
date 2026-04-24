#1
Problem Name: Count all digits in a number

Pattern: Digit Extraction (Math)

Key Idea:
Keep dividing the number by 10 and count how many times until it becomes 0

Steps:

1. Initialize count = 0
2. While n > 0:
   count++
   n = n / 10
3. Return count

Time Complexity: O(log10 n)
Space Complexity: O(1)

Edge Cases:

- n = 0 → answer should be 1 (important)

Mistakes I made:

- Forgot that n = 0 has 1 digit
- Used while(n >= 0) → causes infinite loop

#2
Problem Name: Reverse Number

Pattern: Digit Extraction (Math)

Key Idea:
Take last digit using %10 and build reversed number by multiplying previous result by 10

Steps:

1. Initialize rev = 0
2. While n > 0:
   lastDigit = n % 10
   rev = rev \* 10 + lastDigit
   n = n / 10
3. Return rev

Time Complexity: O(log10 n)
Space Complexity: O(1)

Edge Cases:

- n = 0 → return 0
- numbers ending with 0 → leading zeros get removed after reverse

Mistakes I made:

- Returned 1 for n = 0 (wrong)
- Thought special handling needed for 0 (not required)

Code Snippet:
int rev = 0;
while (n > 0) {
int lastDigit = n % 10;
rev = rev \* 10 + lastDigit;
n /= 10;
}
return rev;

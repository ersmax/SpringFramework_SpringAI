## Smart Console Calculator: Advanced Exercise: Build Your First Java Program That Thinks
Create a minimal console-style calculator in Java that uses predefined values instead of reading input from the user.

Initialize two numbers (e.g., double num1 = 7;, double num2 = 3;) and an operator (e.g., char operator = '+').

Use a while loop controlled by a String again = "y". Inside the loop, perform exactly one calculation and then set again = "n" so the loop ends after the first run.

Use if-else statements to handle the operator: +, -, *, /.

For division, if num2 is 0, print Cannot divide by zero. and do not perform the division.

Print the result using the exact format:
Result: <value>

After the loop ends, print a closing message:
Thank you for using the calculator.

What this reinforces

Variable initialization

Arithmetic operators

Conditional logic with if-else

Loop control via a flag (again)

Defensive check for division by zero

Expected Output (with your current values)
```Java
Result: 10.0
Thank you for using the calculator.
```
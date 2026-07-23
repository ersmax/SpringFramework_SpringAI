package Section2_CoreJava.L26_ProjectCalculator;

public class Exercise {
public static void main(String[] args) {

        // Use predefined numbers num1 = 7 and num2 = 3
        double num1 = 7;
        double num2 = 3;
        // Use predefined operator '+'
        char operator = '+';
        String again = "y";

        // Run the loop while 'again' equals 'y'
        while (again == "y") {
            double result = 0.0;

            // Perform the calculation based on the operator using if-else conditions
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    // Check if num2 is zero before performing division and display a warning if true
                    if (num2 == 0)
                        System.out.println("Cannot divide by zero.");
                    else
                        result = num1 / num2;
                    break;
                default:
                    break;
            }
            // Set 'again' to 'n' to stop the loop after one execution
            again = "n";
            System.out.println("Result: " + result);
            // Display a thank-you message after the loop ends
            System.out.println("Thank you for using the calculator.");
        }









    }
}

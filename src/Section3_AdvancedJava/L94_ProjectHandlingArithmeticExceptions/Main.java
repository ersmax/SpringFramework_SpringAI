package Section3_AdvancedJava.L94_ProjectHandlingArithmeticExceptions;

public class Main {
    public static void main(String[] args) {
        int numerator = 50;
        int denominator = 0;
        double result;

        // Handle division using try-catch
        try {
            result = numerator / denominator;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (Exception e) {
            System.out.println("Another error: " + e);
        }
        finally {
            System.out.println("Program completed");
        }
    }
}

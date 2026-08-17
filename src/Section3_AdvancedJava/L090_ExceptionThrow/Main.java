package Section3_AdvancedJava.L090_ExceptionThrow;

public class Main {
    public static void main(String[] args) {

        int numerator = 10;
        int denominator = 20;
        int result = 0;

        try {
            result = numerator / denominator;
            if (result == 0)
                throw new ArithmeticException("We don't want zero result");
            // I want to call the catch block because there I handle the exception
            // So we throw an exception (a runtime error) to call the catch block
        } catch (ArithmeticException e) {
            result = numerator / 1;
            System.out.println("That's the default output. " + e);
        } catch (Exception e) {
            System.out.println("Default error " + e);
        }
    }
}

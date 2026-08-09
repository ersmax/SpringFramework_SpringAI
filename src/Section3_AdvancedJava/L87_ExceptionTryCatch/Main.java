package Section3_AdvancedJava.L87_ExceptionTryCatch;

public class Main {
    public static void main(String[] args) {

        int numerator = 10;
        int denominator = 0;
        int result = -1;

        try {
            result = numerator / denominator;
        }
        catch (Exception e) {
            System.out.println("Something went wrong");
        }
        System.out.println("Bye");

        System.out.println("---");
        try {
            int i = 0;
            int j = 18 / i;
            System.out.println(j);
            System.out.println("Bye");
        } catch (ArithmeticException e) {
            System.out.println("Something went wrong");
        }
    }
}

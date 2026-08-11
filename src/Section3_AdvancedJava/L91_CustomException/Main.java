package Section3_AdvancedJava.L91_CustomException;

class NewException extends RuntimeException {
    public NewException() {
    }

    public NewException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        int numerator = 20;
        int denominator = 40;
        int result = 0;

        try {
            result = numerator / denominator;
            if (result == 0)
                throw new NewException("We don't want 0 result");
        } catch (NewException e) {
            System.out.println("New exception handled: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0 " + e);
        } catch (Error e) {
            System.out.println("Some other error");
        }
    }
}

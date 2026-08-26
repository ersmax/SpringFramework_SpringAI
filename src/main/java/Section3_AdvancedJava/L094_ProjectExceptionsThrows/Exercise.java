package Section3_AdvancedJava.L094_ProjectExceptionsThrows;

// Define custom exception InvalidAgeException extending Exception
class InvalidAgeException extends RuntimeException {
    public InvalidAgeException() {
    }

    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Exercise {

    public static void checkAge(int age) throws InvalidAgeException {
        // Throw custom exception if age < 18, else print "Access granted"
        if (age < 18)
            throw new InvalidAgeException("Age must be 18 or older");
        System.out.println("Access granted");
    }

    public static void main(String[] args) {
        // Call checkAge(16) and checkAge(21) inside separate try-catch blocks
        try {
            Exercise.checkAge(16);
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Another error: " + e);
        }

        try {
            Exercise.checkAge(21);
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Another error: " + e);
        }
    }
}

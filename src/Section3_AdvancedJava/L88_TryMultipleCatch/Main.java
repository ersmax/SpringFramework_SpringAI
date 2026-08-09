package Section3_AdvancedJava.L88_TryMultipleCatch;

public class Main {
    public static void main(String[] args) {

        int numerator = 10;
        int denominator = 10;
        int result = -1;
        int[] nums = new int[5];
        String str = null;

        try {
            result = numerator / denominator;
            System.out.println(nums[4]);
            System.out.println(str.length());
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index not in bound");
        } catch (Exception e) {
            System.out.println("Something else: " + e);
        }
        System.out.println("Bye");
    }
}

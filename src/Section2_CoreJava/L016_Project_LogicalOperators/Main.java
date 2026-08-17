package Section2_CoreJava.L016_Project_LogicalOperators;

public class Main {
    public static void main(String[] args){

        // write code here
        int a = 20, b = 10;
        System.out.println("Addition: " + (a+b));
        System.out.println("Subtraction: " + (a-b));
        System.out.println("Multiplication: " + (a*b));
        System.out.println("Division: " + (a/b));
        boolean result = a > b;
        System.out.println("Is a greater than b? " + result);
        result = a > b && b > 0;
        System.out.println("Is a > b and b > 0? " + result);
    }
}

package Section2_CoreJava.L027_ClassObjects;

class Calculator {
    private int var = 0;

    public int add(int number1, int number2) {
        return number1 + number2;
    }
}

public class Demo {
    public static void main(String[] args) {
        int num1 = 2, num2 = 1;
        Calculator myCalc = new Calculator();
        int result = myCalc.add(num1, num2);
        System.out.println(result);
    }
}

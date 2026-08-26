package Section2_CoreJava.L031_StackHeap;

class Calculator {
    public int add(int n1, int n2) {
        return n1 + n2;
    }
    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

}

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Calculator cal2 = new Calculator();
        int result = cal.add(2, 4);
        System.out.println(result);
        result = cal2.add(5, 6);
        System.out.println(result);
    }
}

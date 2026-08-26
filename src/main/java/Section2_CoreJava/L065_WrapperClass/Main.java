package Section2_CoreJava.L065_WrapperClass;

public class Main {
    public static void main(String[] args) {
        int num = 7;
        Integer num1 = num;         // auto-boxing

        int num2 = num1;            // auto-unboxing

        String str = "12";
        int num3 = Integer.parseInt(str);

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3 * 2);
    }

    public void main(String[] args, int number) {
        System.out.println("Hello");
    }
}

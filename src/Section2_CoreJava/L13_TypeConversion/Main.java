package Section2_CoreJava.L13_TypeConversion;

public class Main {
    public static void main(String[] args) {
        byte  b = 127;
        int a = 257;
        b = (byte)a;    // a % 256
        System.out.println(b);

        float f = 5.6f;
        int x = (int)f;
        System.out.println(x);

        byte aa = 10;
        byte bb = 30;
        int result = aa * bb;
        System.out.println(result); // type promotion



    }
}

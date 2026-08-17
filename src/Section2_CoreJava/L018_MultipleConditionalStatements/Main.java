package Section2_CoreJava.L018_MultipleConditionalStatements;

public class Main {
    public static void main(String[] args) {
        int x = 8;
        int y = 7;
        int z = 9;
        System.out.print("The greates is ");
        if (x > y && x > z)
            System.out.println("x: " + x);
        else if (y > z)
            System.out.println("y: " + y);
        else
            System.out.println("z: " + z);
    }
}

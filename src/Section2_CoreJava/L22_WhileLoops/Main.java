package Section2_CoreJava.L22_WhileLoops;

public class Main {
    public static void main(String[] args) {
        int idx = 1;
        while (idx <= 4) {
            int jdx = 1;
            while (jdx <= 3) {
                System.out.println("idx: " + idx + " jdx: " + jdx);
                ++jdx;
            }
            ++idx;
        }
        System.out.println("idx final: " + idx);
    }
}

package Section2_CoreJava.L025_ProjectLoops;

public class Exercise {
    public static void main(String[] args) {
        int idx = 1;

        // Print numbers 1 to 5 using for loop
        System.out.print("For Loop: ");
        for (; idx < 6; idx++)
            System.out.print(idx + " ");

        System.out.println();

        // Print numbers 1 to 5 using while loop
        System.out.print("While Loop: ");
        idx = 1;
        while (idx < 6) {
            System.out.print(idx + " ");
            ++idx;
        }
        System.out.println();

        // Print numbers 1 to 5 using do-while loop
        System.out.print("Do-While Loop: ");
        idx = 1;
        do {
            System.out.print(idx + " ");
            ++idx;
        } while (idx < 6);
        System.out.println();
    }
}

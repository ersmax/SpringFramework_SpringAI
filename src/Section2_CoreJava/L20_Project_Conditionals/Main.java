package Section2_CoreJava.L20_Project_Conditionals;

public class Main {
    public static void main(String[] args) {
        int score = 75;
        char grade = 'B';
        boolean passed = false;

        // TODO: Check pass or fail
        if (score >= 50) {
            passed = true;
            System.out.println("Passed");
        }
        else
            System.out.println("Failed");

        // TODO: Determine grade based on score
        if  (!passed) return;

        System.out.print("Grade: ");
        if (score >= 90)
            grade = 'A';
        else if (score >= 75)
            grade = 'B';
        else if (score >= 60)
            grade = 'C';
        else
            grade = 'D';

        System.out.println(grade);
    }
}

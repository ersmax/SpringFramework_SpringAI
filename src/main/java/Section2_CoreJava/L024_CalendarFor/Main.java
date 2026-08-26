package Section2_CoreJava.L024_CalendarFor;

public class Main {
    public static void main(String[] args) {
        for (int day = 1; day < 6; day++) {
            System.out.println("Day: " + day);
            for (int hour = 0; hour < 9; hour++) {
                System.out.println("\t" + (hour + 9) + " - " + (hour + 10));
            }
        }
    }
}

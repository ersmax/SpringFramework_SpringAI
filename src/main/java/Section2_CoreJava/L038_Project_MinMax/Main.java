package Section2_CoreJava.L038_Project_MinMax;

public class Main
{
    public static void main(String[] args)
    {
        // Declare and initialize an integer array with the values 45, 22, 89, 16, 90, and 33
        int[] numbers = {45, 22, 89, 16, 90, 33};

        // Initialize min and max with the first element
        int min = (numbers.length >= 0) ? numbers[0] : -1;
        int max = (numbers.length >= 0) ? numbers[0] : -1;

        // Use an enhanced for loop to find min and max
        for (int number : numbers)
        {
            min = Math.min(number, min);
            max = Math.max(number, max);
        }

        // Print the smallest and largest numbers
        System.out.println("Smallest: " + min);
        System.out.println("Largest: " + max);
    }
}

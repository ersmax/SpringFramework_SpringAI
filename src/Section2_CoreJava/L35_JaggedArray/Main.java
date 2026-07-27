package Section2_CoreJava.L35_JaggedArray;

public class Main {

    public static void main(String[] args)
    {
        // jagged
        int[][] nums = new int[3][];
        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];

        for (int row = 0; row < nums.length; row++)
            for (int col = 0; col < nums[row].length; col++)
                nums[row][col] = (int)(Math.random() * 10);

        // enhanced for loop
        for (int[] row : nums)
        {
            for (int col : row) System.out.print(col + " ");
            System.out.println();
        }
    }
}

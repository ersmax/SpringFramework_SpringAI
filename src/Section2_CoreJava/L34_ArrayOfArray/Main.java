package Section2_CoreJava.L34_ArrayOfArray;

class Student
{

}

public class Main {
    public static void main(String[] args)
    {
        int[][] num = new int[3][4];

        for (int idx = 0; idx < num.length; idx++)
        {
            for (int jdx = 0; jdx < 4; jdx++) {
                num[idx][jdx] = (int)(Math.random() * 10);
                System.out.print(num[idx][jdx] + " ");
            }
            System.out.println();
        }
        System.out.println("============");

        // row is an array of size 4
        for (int[] row : num)
        {
            for (int col : row)
                System.out.print(col + " ");

            System.out.println();
        }

    }
}

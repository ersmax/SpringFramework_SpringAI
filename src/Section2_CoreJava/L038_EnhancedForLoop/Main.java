package Section2_CoreJava.L038_EnhancedForLoop;

public class Main
{
    public static void main(String[] args)
    {
        int[] nums = new int[4];
        nums[0] = 4;
        nums[1] = 8;
        nums[2] = 3;
        nums[3] = 9;

        for (int n : nums)
            System.out.println(n);
    }
}

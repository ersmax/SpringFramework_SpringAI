package Section2_CoreJava.L33_Array;

public class Main {

    public static void printAll(int[] array) {
        for (int idx = 0; idx < array.length; idx++)
            System.out.print(array[idx] + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 6};
        System.out.println(nums[0]);
        nums[0] = 7;
        System.out.println(nums[0]);

        // all values are 0
        int nums2[] = new int[4];
        printAll(nums2);

    }
}

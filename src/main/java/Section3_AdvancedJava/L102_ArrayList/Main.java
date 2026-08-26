package Section3_AdvancedJava.L102_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Without indication of type in generics,
        // we may risk a runtime exception, as the below example illustrates
        Collection nums = new ArrayList();
        nums.add(6); nums.add(9); nums.add(12); nums.add(3);
//        nums.add("5");
        System.out.println(nums);

        for (Object n : nums)
            System.out.print((Integer) n + " ");
        System.out.println();

        // By indicating the type under generics, we can highlight the issue
        // at compile time
        Collection<Integer> nums2 = new ArrayList<Integer>();
        nums2.add(6); nums2.add(9); nums2.add(12); nums2.add(3);
//        nums2.add("5");
        System.out.println(nums2);

        for (int n : nums2)
            System.out.print(n + " ");
        System.out.println();

        // By using List interface, we can use the method to index elements
        List<Integer> nums3 = new ArrayList<Integer>();
        nums3.add(1); nums3.add(3); nums3.add(2);
        System.out.println(nums3);

        for (int idx = 0; idx < nums3.toArray().length; idx++)
            System.out.print(nums3.get(idx) + " ");
        System.out.println();

    }
}

package Section3_AdvancedJava.L103_Set;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Integer> nums = new HashSet<Integer>();
        nums.add(6);
        nums.add(15);
        nums.add(6);
        nums.add(100);

        for (int n : nums)
            System.out.println(n);
        System.out.println();

        Collection<Integer> nums2 = new TreeSet<Integer>();
        nums2.add(6);
        nums2.add(15);
        nums2.add(6);
        nums2.add(100);

        Iterator<Integer> values = nums2.iterator();
        while (values.hasNext())
            System.out.println(values.next());

//        for (int n : nums2)
//            System.out.println(n);
    }
}

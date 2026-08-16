package Section3_AdvancedJava.L106_StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

//        List<Integer> nums = new ArrayList<>();
//        nums.add(4); nums.add(5); nums.add(6); nums.add(7);
        List<Integer> nums = Arrays.asList(4, 5, 6, 7);
        System.out.println(nums);
        for (int idx = 0; idx < nums.size(); idx++)
            System.out.println(nums.get(idx));
        for (int num : nums)
            System.out.println(num);
        nums.forEach(num -> System.out.println(num));

        int sum = 0;
        for (int n : nums) {
            if (n % 2 == 0) {
                n *= 2;
                sum += n;
            }
        }
        System.out.println(sum);

        int sumStream = nums.stream()
                .filter(n -> n % 2 == 0)    // select even numbers
                .map(n -> n * 2)            // double selected numbers
                .reduce(0, Integer::sum);   // Sum up the modified values
        System.out.println(sumStream);
    }
}

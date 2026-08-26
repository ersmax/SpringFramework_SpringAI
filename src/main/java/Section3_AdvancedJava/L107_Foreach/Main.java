package Section3_AdvancedJava.L107_Foreach;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 6, 7);

        // Step 1: Anonymous class
        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer num) {
                System.out.println(num);
            }
        };
        nums.forEach(consumer);

        // Step 2: lambda
        Consumer<Integer> consumer2 = num -> System.out.println(num);
        nums.forEach(consumer2);

        // Step 3: pass lambda as an argument to forEach
        nums.forEach(num -> System.out.println(num));
    }
}

package Section3_AdvancedJava.L108_StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4, 5, 6, 7);

        // Once you use a stream, you can't reuse it
        Stream<Integer> stream = nums.stream();         // it returns the object of Stream API
        stream.forEach(num -> System.out.println(num));
//        stream.forEach(num -> System.out.println(num));

        // Once you use a stream, you can't reuse it
        Stream<Integer> stream1 = nums.stream();         // it returns the object of Stream
        Stream<Integer> stream2 = stream1.filter(num -> num % 2 == 0);
        Stream<Integer> stream3 = stream2.map(num -> num * 2);
        int result = stream3.reduce(0, (sum, secondTerm) -> sum + secondTerm);
        System.out.println(result);

        Stream<Integer> s1 = nums.stream();
        s1 = s1.filter(num -> num % 2 == 0);
        s1 = s1.map(num -> num * 2);
        int res = s1.reduce(0, (sum, secondTerm) -> sum + secondTerm);
        System.out.println(res);

    }
}

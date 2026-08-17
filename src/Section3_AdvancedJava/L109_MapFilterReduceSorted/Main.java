package Section3_AdvancedJava.L109_MapFilterReduceSorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

        Consumer<Integer> c = new Consumer<Integer>() {
            @Override
            public void accept(Integer value) {
                System.out.println(value);
            }
        };
        Consumer<Integer> cons = value -> System.out.println(value);

        Predicate<Integer> p = new Predicate<Integer>() {
            @Override
            public boolean test(Integer value) {
                return value % 2 == 0;
            }
        };
        Predicate<Integer> predicate = value -> value % 2 == 0;

        Function<Integer, Integer> f = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer value) {
                return value * 2;
            }
        };
        Function<Integer, Integer> function = value -> value * 2;

        BinaryOperator<Integer> bin = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer carry, Integer element) {
                return carry + element;
            }
        };
        BinaryOperator<Integer> binaryOp = (carry, element) -> carry + element;


        int result = nums.stream()                             // source stage : stream is created from a data source
                        .filter(n -> n % 2 == 0)        // Intermediate : operations that transform data but don't consume it
                        .map(n -> n * 2)                // Intermediate
                        .reduce(0, (sum, operand) -> sum + operand);  // Terminal stage : operation that consume the stream anc close the pipeline
        System.out.println("Sum of the twice of Even numbers: " + result);

        // Sum for single threads
        int singleSum = nums.parallelStream()
                            .reduce(0,
                                    (carry, element) -> carry + element);
        System.out.println("Sum for single thread: " + singleSum);


        BiFunction<Integer, Integer, Integer> biF = new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer subtot, Integer element) {
                return subtot + element;
            }
        };
        BiFunction<Integer, Integer, Integer> biFunction = (subtot, element) -> subtot + element;

        BinaryOperator<Integer> biO = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer subtot1, Integer subtot2) {
                return subtot1 + subtot2;
            }
        };
        BinaryOperator<Integer> binaryOperator = (subtot1, subtot2) -> subtot1 + subtot2;

        // Sum with multiple threads
        int parallelSum = nums.parallelStream()
                            .reduce(0,
                                    (subtot, element) -> subtot + element,
                                    (subtot1, subtot2) -> subtot1 + subtot2);
        System.out.println("Sum for multiple threads: " + parallelSum);

        // Sort with a single thread
        Stream<Integer> sortedValues = nums.stream()
                                            .filter(num -> num  % 2 == 0)
                                            .sorted(Comparator.reverseOrder());
        sortedValues.forEach(System.out::println);

        // Filter with multiple thread
        Stream<Integer> sortedParallel = nums.parallelStream()
                                            .filter(num -> num % 2 == 0);
        sortedParallel.forEach(num -> System.out.println(num));

    }
}

package Section3_AdvancedJava.L110_ParallelStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        int size = 10_000;
        List<Integer> nums = new ArrayList<>(size);

        Random ran = new Random();
        for (int idx = 0; idx < size; idx++ )
            nums.add(ran.nextInt(100));

        long startSeq;
        long endSeq;

        startSeq = System.currentTimeMillis();
        int sum = nums.stream()
                        .map(num -> num * 2)
                        .reduce(0, (carry, element) -> carry + element);
        endSeq = System.currentTimeMillis();
        System.out.println("Sequential reduce: " + sum + " Tot time (ms): " + (endSeq - startSeq));

        startSeq = System.currentTimeMillis();
        int sum2 = nums.stream()
                        .map(num -> num * 2)
                        .mapToInt(num -> num)
                        .sum();
        endSeq = System.currentTimeMillis();
        System.out.println("Sequential mapToInt + sum: " + sum2 + " Tot time (ms): " + (endSeq - startSeq));

        startSeq = System.currentTimeMillis();
        int sum3 = nums.parallelStream()
                .map(num -> num * 2)
                .reduce(0,
                        (carry, element) -> carry + element,
                        (subtot1, subtot2) -> subtot1 + subtot2);
        endSeq = System.currentTimeMillis();
        System.out.println("Parallel reduce: " + sum3 + " Tot time (ms): " + (endSeq - startSeq));

        startSeq = System.currentTimeMillis();
        int sum4 = nums.parallelStream()
                        .map(num -> num * 2)
                        .mapToInt(num -> num)
                        .sum();
        endSeq = System.currentTimeMillis();
        System.out.println("Parallel mapToInt + sum: " + sum4 + " Tot time (ms): " + (endSeq - startSeq));


        // What if each operation takes 1 ms ?
        Function<Integer, Integer> function = num -> {
            try {
                Thread.sleep(0,1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return num * 2;
        };

        startSeq = System.currentTimeMillis();
        int sequentialSum = nums.stream()
                                .map(function)
                                .mapToInt(num -> num)
                                .sum();
        endSeq = System.currentTimeMillis();
        System.out.println("Sequential mapToInt + sum + 1ms op: " + sequentialSum + " Tot time (ms): " + (endSeq - startSeq));

        startSeq = System.currentTimeMillis();
        Stream<Integer> myStream = nums.parallelStream();
        int parallelSum = myStream.map(function)
                                  .mapToInt(num -> num)
                                  .sum();
        endSeq = System.currentTimeMillis();
        System.out.println("Parallel mapToInt + sum + 1ms op: " + sequentialSum + " Tot time (ms): " + (endSeq - startSeq));
    }
}

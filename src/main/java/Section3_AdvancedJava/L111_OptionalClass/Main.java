package Section3_AdvancedJava.L111_OptionalClass;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Max", "Alex");

        // if you don't have a name with "X", the Stream API will
        // return null, and name will have null, throwing a NPE or
        // null pointer exception if queried, we want to avoid that
        // Optional can have some names or be empty
        Optional<String> name = names.stream()
                            .filter(str -> str.contains("z"))
                            .findFirst();

//        System.out.println(name.get());
        System.out.println(name.orElse("Not found"));

        String result = names.parallelStream()
                            .filter(str -> str.contains("z"))
                            .findFirst()
                            .orElse("Not found");
        System.out.println(result);
    }
}

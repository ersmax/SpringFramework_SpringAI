package Section3_AdvancedJava.L112_MethodReference;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alex", "John", "Sarah");

        List<String> uNames = names.stream()
                .map(name -> name.toUpperCase())
                .toList();
        System.out.println(uNames);
        uNames.forEach(System.out::println);

        List<String> uNamesReference = names.stream()
                                            .map(String::toUpperCase)   // for every element coming from the map convert it to UpperCase
                                            .toList();
        System.out.println(uNamesReference);
    }
}

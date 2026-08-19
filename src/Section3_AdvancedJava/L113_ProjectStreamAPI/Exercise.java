package Section3_AdvancedJava.L113_ProjectStreamAPI;

import java.util.Arrays;
import java.util.List;

public class Exercise {

    public static void main(String[] args) {

        List<String> products = Arrays.asList("Laptop", "Pen", "Notebook", "Headphones", "Smartphone");

        // Print the original list
        System.out.println("Original List: " + products);

        // Filter names longer than 5 characters, convert to uppercase, sort, and collect into a list
        List<String> names = products.stream()
                .filter(product -> product.length() >= 5)
                .map(String::toUpperCase)
                .sorted()
                .toList();

        // Print the filtered list
        System.out.println("Filtered Products: " + names);
    }
}

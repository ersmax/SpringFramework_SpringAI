package Section3_AdvancedJava.L105_ProjectCollections;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.LinkedHashSet;

public class Exercise {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Alice", "David", "Bob");

        // Print the original list
        System.out.println("Original List: " + names);

        // Convert the list to a LinkedHashSet to remove duplicates while preserving order
        Set<String> uniqueNames = new LinkedHashSet<>(names);

//        Iterator<String> namesIt = names.iterator();
//        while (namesIt.hasNext()) {
//            uniqueNames.add(namesIt.next());
//        }
//        uniqueNames.addAll(names);

        // Print the set of unique names
        System.out.println("Unique Names: " + uniqueNames);
    }
}

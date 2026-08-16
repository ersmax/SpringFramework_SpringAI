package Section3_AdvancedJava.L104_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Keys are a Set, Values are a List.
        // Set and Values in combination form a Map
        Map<String, Integer> students = new HashMap<>();
        students.put("Pluto", 56);
        students.put("Duffy", 21);
        students.put("Duck", 45);
        students.put("Jack", 99);

        students.put("Duffy", 100); // replace old value for Duffy key

        System.out.println(students);
        System.out.println(students.get("Jack"));

        System.out.println("---");
        System.out.println("Printing all the keys:");
        Iterator<String> values = students.keySet().iterator();
        while (values.hasNext())
            System.out.println(values.next());


        System.out.println("---");
        System.out.println("Printing all the values:");
        System.out.println(students.values());

        System.out.println("---");
        System.out.println("Printing all the entries:");
        System.out.println(students.entrySet());


        System.out.println("---");
        for (String key : students.keySet())
            System.out.println(key + " : " + students.get(key));
    }
}

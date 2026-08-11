package Section3_AdvancedJava.L94_TryWithResources;

import Section2_CoreJava.L59_AccessModifiers.other.B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        int num = 0;
        BufferedReader buf = null;

        try {
            InputStreamReader in = new InputStreamReader(System.in);
            buf = new BufferedReader(in);
            num = Integer.parseInt(buf.readLine());
            System.out.println(num);
        }
        finally {
            buf.close();
            System.out.println("Bye");
        }

        /** It is equivalent to the following */
        // I'm creating the object inside the try,
        // and once the try finishes, the resource gets closed automatically
        // Because it implements AutoCloseable interface

        try (BufferedReader buf2 = new BufferedReader(new InputStreamReader(System.in))) {
            num = Integer.parseInt(buf2.readLine());
            System.out.println(num);
        }
    }
}

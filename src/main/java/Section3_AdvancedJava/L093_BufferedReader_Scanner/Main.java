package Section3_AdvancedJava.L093_BufferedReader_Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

//        int num = System.in.read(); // Not ideal because it returns the ASCII value
//        System.out.println(num);


        /** Old way */
        System.out.println("Enter a number:");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        int num2 = Integer.parseInt(bf.readLine());
        System.out.println(num2);
        bf.close();

        /** New way */
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
    }
}

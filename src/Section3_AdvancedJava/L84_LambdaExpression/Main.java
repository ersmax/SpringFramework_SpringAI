package Section3_AdvancedJava.L84_LambdaExpression;

import jdk.jfr.Label;

@FunctionalInterface
interface A {
    void show(int idx, double jdx);
}
public class Main {
    public static void main(String[] args) {
//        A obj = new A() {
//            @Override
//            public void show(int idx, double jdx) {
//                System.out.println("In inner show " + idx);
//            }
//        };

        /** No file creation after compilation for lambda expressions */
        A obj2 = (idx, jdx) -> System.out.println("In Lambda show " + idx);
        obj2.show(0, 1.2);
    }
}

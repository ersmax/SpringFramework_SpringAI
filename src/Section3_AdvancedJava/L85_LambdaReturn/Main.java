package Section3_AdvancedJava.L85_LambdaReturn;

@FunctionalInterface
interface A {
    int add(int idx, int jdx);
}

public class Main {
    public static void main(String[] args) {

        A obj2 = new A() {
            @Override
            public int add(int idx, int jdx) {
                return idx + jdx;
            }
        };

        A obj = (idx, jdx) -> idx + jdx;

        int result = obj.add(5, 4);
        System.out.println(result);
    }
}


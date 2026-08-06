package Section3_AdvancedJava.L73_AnonymousInnerClass;

class A {
    private int abc;

    public void show() {
        System.out.println("in A show");
    }
}

public class Main {

    public static void main(String[] args) {

        /** Anonymous class */
        A obj = new A() {
            @Override
            public void show() {
                System.out.println("In anonymous show");
            }

            public void play() {
                System.out.println("In anonymous play");
            }
        };
        obj.show();

        A obj2 = new A();
        obj2.show();
    }
}

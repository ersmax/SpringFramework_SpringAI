package Section3_AdvancedJava.L83_FunctionalInterface;

/** Functional Interfac or Single Abstract Method interface */
@FunctionalInterface
interface A {
    void show();
}

class B implements A {
    public void show() {
        System.out.println("In B show");
    }
}

public class Main {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();


        A obj2 = new A() {
            @Override
            public void show() {
                System.out.println("In inner show");
            }
        };
        obj2.show();
    }
}

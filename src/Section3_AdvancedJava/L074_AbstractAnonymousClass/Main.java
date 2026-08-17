package Section3_AdvancedJava.L074_AbstractAnonymousClass;

abstract class A {
    public abstract void show();
    public abstract void config();
}

public class Main {

    public static void main(String[] args) {

        /** Creating an object of an anonymous inner class */
        A obj = new A() {
            @Override
            public void show() {
                System.out.println("In anonymous show");
            }

            @Override
            public void config() {
                System.out.println("In anonymous config");
            }
        };
        obj.show();
        obj.config();
    }
}

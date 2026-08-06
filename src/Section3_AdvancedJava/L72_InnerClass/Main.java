package Section3_AdvancedJava.L72_InnerClass;

class A {

    int age;

    public void show() {
        System.out.println("in show");
    }

    class B {
        public void config() {
            System.out.println("in config B");
        }
    }

    static class C {
        public void config() {
            System.out.println("in config C");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj2 = obj.new B();
        obj2.config();

        // creating an instance of the static inner class
        // without creating an outer class object
        A.C obj3 = new A.C();
        obj3.config();
    }
}

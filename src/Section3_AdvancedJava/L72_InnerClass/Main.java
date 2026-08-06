package Section3_AdvancedJava.L72_InnerClass;

class A {

    private int age;

    public void show() {
        System.out.println("in show");
    }

    class B {
        private int year;

        public void config() {
            System.out.println("in config B" + age);
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

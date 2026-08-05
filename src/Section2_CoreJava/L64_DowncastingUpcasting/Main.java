package Section2_CoreJava.L64_DowncastingUpcasting;

class A {
    public void show1() {
        System.out.println("in A show");
    }
}
class B extends A {
    public void show2() {
        System.out.println("in B show");
    }
}

public class Main {
    public static void main(String[] args) {

        /** Typecasting */
        double d = 4.5;
        int i = (int) d;
        System.out.println(i);

        /** Upcasting */
        A obj = (A)new B();
        obj.show1();

        /** Downcasting */
        B obj1 = (B) obj;
        obj1.show2();
        /* or */
        ((B) obj).show2();
    }
}

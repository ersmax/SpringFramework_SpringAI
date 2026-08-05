package Section2_CoreJava.L56_ThisSuper;

class A extends Object {
    public A() {
        super(); // create an object
        System.out.println("in A");
    }
    public A(int A) {
        super();
        System.out.println("in A int");
    }
}
class B extends A  {
    public B() {
        super(5);
        System.out.println("in B");
    }
    public B(int n) {
        this();
        System.out.println("in B int");
    }
}

public class Main {
    public static void main(String[] args) {
        B obj = new B(5);
    }

}

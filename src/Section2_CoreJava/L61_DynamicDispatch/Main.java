package Section2_CoreJava.L61_DynamicDispatch;

class A {
    public void show() {
        System.out.println("In A Show");
    }
}
class B extends A {
    @Override
    public void show() {
        System.out.println("In B Show");
    }
}
class C extends A {
    @Override
    public void show() {
        System.out.println("In C show");
    }
}

public class Main {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();     // In A

        obj = new B();
        obj.show();     // In B

        obj = new C();
        obj.show();     // In C
    }
}

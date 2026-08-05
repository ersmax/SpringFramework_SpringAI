package Section2_CoreJava.L57_Overriding;

class A {
    public void show() {
        System.out.println("in A show");
    }
    public void config() {
        System.out.println("in A config");
    }
    public int add(int n1, int n2) {
        return n1 + n2;
    }
}
class B extends A {
    @Override
    public void show() {
        System.out.println("in B show");
    }

    @Override
    public int add(int n1, int n2) {
        return n1 + n2 + 1000;
    }
}

public class Main {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.config();
        int r = obj.add(10, 20);
        System.out.println(r);
    }
}

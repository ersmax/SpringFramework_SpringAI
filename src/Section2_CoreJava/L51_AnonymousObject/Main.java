package Section2_CoreJava.L51_AnonymousObject;

class A {
    public A() {
        System.out.println("object created");
    }

    public void show() {
        System.out.println("in a show");
    }

}

public class Main {
    public static void main(String[] args) {
        new A().show(); // anonymous object
        new A().show();
    }
}

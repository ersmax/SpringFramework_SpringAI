package Section3_AdvancedJava.L081_Annotation;

class A {
    public void show() {
        System.out.println("In A show");
    }
}
class B extends A {
    @Override
    public void show() {
        System.out.println("In B show");
    }
}

public class Main {

    public static void main(String[] args) {

    }
}

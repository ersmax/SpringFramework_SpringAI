package Section3_AdvancedJava.L75_Interfaces;

abstract class oldA {
    public abstract void show();
    public abstract void config();
}

interface A {
    final static int people = 40_000_000;        // final and static
    final static String area = "NY";            // final and static

    public abstract void show();
    public abstract void config();
}

class B implements A {
    @Override
    public void show() {
        System.out.println("in show of A");
    }

    @Override
    public void config() {
        System.out.println("in config of B");
    }
}

public class Main {

    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.config();

        System.out.println(A.area);
    }
}

package Section3_AdvancedJava.L076_MultipleInterfaces;

interface A {
    int people = 10_000_000;
    String area = "NY";

    void show();
    void config();
}

interface X {
    void run();
}

interface Y extends X {

}

class B implements A, Y {
    @Override
    public void show() {
        System.out.println("In show B");
    }

    @Override
    public void config() {
        System.out.println("In config B");
    }

    @Override
    public void run() {
        System.out.println("In run B");
    }
}

public class Main {
    public static void main(String[] args) {
        A obj = new B();
        obj.config();
        obj.show();

        Y obj1 = new B();
        obj1.run();

        System.out.println(A.area + " has " + A.people + " people.");
    }
}

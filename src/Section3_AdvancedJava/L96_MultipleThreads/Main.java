package Section3_AdvancedJava.L96_MultipleThreads;

class A extends Thread {
    @Override
    public void run() {
        for (int idx = 0; idx < 10; idx++)
            System.out.println("Hi");
    }
}

class B extends Thread {
    @Override
    public void run() {
        for (int idx = 0; idx < 10; idx++)
            System.out.println("There");
    }
}

public class Main {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
    }
}

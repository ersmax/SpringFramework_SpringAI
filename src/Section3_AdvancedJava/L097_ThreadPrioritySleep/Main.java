package Section3_AdvancedJava.L097_ThreadPrioritySleep;

class A extends Thread {
    public void run() {
        for (int idx = 0; idx < 10; idx++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);   // tell thread to wait
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e);
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int idx = 0; idx < 10; idx++) {
            System.out.println("There");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}

public class Main {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        System.out.println(obj1.getPriority() + " " + obj2.getPriority());

//        obj1.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        obj2.start();
    }
}

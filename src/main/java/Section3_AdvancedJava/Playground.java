package Section3_AdvancedJava;

class Parent {
    public static void greet() {
        System.out.println("Hello from parent");
    }

    private static void greetStat() {
        System.out.println("Hello from static parent");
    }
}

class Child extends Parent {
    public static void greet() {
        System.out.println("Hello from kid");
    }

    private static void greetStat() {
        System.out.println("Hello from static child");
    }
}


public class Playground {
    private final int myVariable;
    {
        myVariable = 10;
    }

    public void show() {
        System.out.println(myVariable);
    }

    public static void main(String[] args) {
        Parent p = new Child();
        p.greet();          // Hello from parent
        Parent.greet();     // Hello from parent

        Child c = new Child();
        c.greet();          // Hello from child
        Child.greet();      // Hello from child

        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f'};
        String str = new String(chars, 1, 3);
        System.out.println(str);
    }
}

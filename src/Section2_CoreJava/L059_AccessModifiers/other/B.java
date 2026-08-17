package Section2_CoreJava.L059_AccessModifiers.other;

public class B {
    void show() {
        A obj = new A();
        System.out.println(obj.marks);
        System.out.println(obj.members);
    }
}

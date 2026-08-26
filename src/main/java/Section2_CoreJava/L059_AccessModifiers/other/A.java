package Section2_CoreJava.L059_AccessModifiers.other;

class Launch {
    public void abc() {
        A obj = new A();
        System.out.println(obj.members);
    }
}

public class A {
    int marks = 10;

    protected int members = 1000;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}

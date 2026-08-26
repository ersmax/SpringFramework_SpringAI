package Section2_CoreJava.L059_AccessModifiers;
import Section2_CoreJava.L059_AccessModifiers.other.A;

class Subclass extends A {

    /**
     * Protected members can be accessed within the package
     * and by subclasses outside the package
     */
    public void showSubclassMember(Subclass mySubclass) {
        System.out.println(mySubclass.members);
    }
}

public class Main {
    public static void main(String[] args) {

        Subclass obj = new Subclass();
        obj.setMarks(10);
        int r = obj.getMarks();
        System.out.println(r);

        obj.showSubclassMember(obj);
    }
}

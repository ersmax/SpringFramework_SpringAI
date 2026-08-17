package Section2_CoreJava.L047_StaticVariable;

class Mobile {
    static String brand;
    int price;
    String name;

    public void show() {
        System.out.println(brand + " " + name + ", " + price );
    }
}

/** Second example */
class Parent {
    public static void display() {
        System.out.println("Static method in Parent");
    }
}

class Child extends Parent {
    // This hides Parent.display(), it does not override it
    public static void display() {
        System.out.println("Static method in Child");
    }
}


public class Main {

    public static void main(String[] args) {
        Mobile.brand = "XYZ";
        Mobile obj1 = new Mobile();
        Mobile obj2 = new Mobile();

        obj1.name = "G20"; obj1.price = 100;
        obj2.name = "G21"; obj2.price = 200;
        obj1.show();
        obj2.show();

        // Reference type is Parent, Object type is Child
        Parent obj = new Child();

        // Triggers early binding: Compiler looks at reference type (Parent)
        obj.display();  // static method in Parent

        Parent.display();   // display Static method in Parent
        Child.display();    // display Static method in Child


        /** Method hiding can be seen below */
        // 1. Reference is Parent, Object is Child
        Parent obj3 = new Child();
        obj3.display(); // Outputs: "Static method in Parent"

        // 2. Reference is Child, Object is Child
        Child obj4 = new Child();
        obj4.display(); // Outputs: "Static method in Child"

        /*
        Why this proves "Hiding" and not "Overriding" ?
        If this were true method overriding, both calls would output "Static method in Child"
        because both variables point to a new Child() object in memory.
        Instead, the output changes based purely on the reference type:
        When looking through a Parent reference (obj3), the child's method is invisible.
        The compiler only sees the parent's method.
        When looking through a Child reference (obj4), the child's method hides the parent's method.
        The compiler chooses the child's version.
         */
    }
}

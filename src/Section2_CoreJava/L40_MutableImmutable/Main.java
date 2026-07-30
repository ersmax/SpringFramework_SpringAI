package Section2_CoreJava.L40_MutableImmutable;

public class Main
{
    public static void main(String[] args)
    {
        String name = "ready";      // becomes unused and collected by garbage collector
        name = name + " let's go";  // new object: String is immutable
        System.out.println(name);

        StringBuffer mutable = new StringBuffer("mutable");
        mutable.append(" string");
        System.out.println(mutable);

        String s1 = "Ready";
        String s2 = "Ready";    // same object
        System.out.println(s1 == s2);

    }
}

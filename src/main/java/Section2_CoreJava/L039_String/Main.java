package Section2_CoreJava.L039_String;

public class Main
{
    public static void main(String[] args)
    {
        String person = new String("myName");
        System.out.println(person.charAt(2));
        System.out.println(person.concat(" surname"));

        String s1 = "string";
        String s2 = "string";
        s1 = "hello";
        System.out.println(s2);

        String s = new String("Hello");
        String ss = new String("Hello");
        System.out.println(s == ss);
        s = s.intern();
        ss = ss.intern();
        System.out.println(s == ss);

        String mys1 = new String("Navy");
        String mys2 = new String("Navy");
        System.out.println(mys1 == mys2);

    }
}

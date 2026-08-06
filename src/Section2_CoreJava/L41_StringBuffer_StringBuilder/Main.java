package Section2_CoreJava.L41_StringBuffer_StringBuilder;

public class Main {

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
//        for (int idx = str.length() - 1; idx >= 0; idx--)
//            sb.append(str.charAt(idx));
    }


    public static void main(String[] args) {
        StringBuffer myStringBuffer = new StringBuffer("h");
        System.out.println(myStringBuffer.capacity());
        System.out.println(myStringBuffer.length());

        myStringBuffer.append("ello beautiful world");
        System.out.println(myStringBuffer.capacity());
        System.out.println(myStringBuffer.length());
        myStringBuffer.deleteCharAt(0);
        myStringBuffer.delete(0, 4);
        System.out.println(myStringBuffer.length());
        //myStringBuffer.setLength(50);
        //System.out.println(myStringBuffer.length());
        myStringBuffer.ensureCapacity(200);
        System.out.println(myStringBuffer.capacity());

        myStringBuffer.insert(0, "Java");
        System.out.println(myStringBuffer);

        String str = myStringBuffer.toString();

        String text = "hello";
        System.out.println(reverseString(text));

    }
}

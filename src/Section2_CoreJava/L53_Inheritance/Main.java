package Section2_CoreJava.L53_Inheritance;

public class Main {
    public static void main(String[] args) {
        Calc obj = new Calc();
        int r1 = obj.add(4, 5);
        int r2 = obj.sub(7, 3);
        System.out.println(r1);
        System.out.println(r2);

        AdvCalc obj2 = new AdvCalc();
        int r3 = obj2.add(4, 5);
        int r4 = obj2.multi(15, 4);
        int r5 = obj2.div(10, 0);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
    }
}

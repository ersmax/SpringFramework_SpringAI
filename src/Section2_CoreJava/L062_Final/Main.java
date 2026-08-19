package Section2_CoreJava.L062_Final;

class Calc {
    final public void show() {
        System.out.println("In Calc show");
    }
    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

class AdvCalc extends Calc {
//    @Override
//    public void show() {
//        System.out.println("In AdvCalc show");
//    }
}

public class Main {
    public static void main(String[] args) {
        final int num;
        {
            num = 0;
        }
        System.out.println(num);
        Calc obj = new AdvCalc();
        obj.show();
        obj.add(4, 5);
    }
}

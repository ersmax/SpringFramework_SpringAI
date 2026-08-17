package Section2_CoreJava.L053_Inheritance;

public class AdvCalc extends Calc
{
    public int multi(int n1, int n2) {
        return n1 * n2;
    }
    public int div(int n1, int n2) {
        if (n2 == 0)    return -1;
        return n1 / n2;
    }
}

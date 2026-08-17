package Section2_CoreJava.L054_MultiLevelInheritance;
import Section2_CoreJava.L053_Inheritance.AdvCalc;

public class VeryAdvCalc extends AdvCalc
{
    public double power(int n1, int n2) {
        return Math.pow(n1, n2);
    }
}

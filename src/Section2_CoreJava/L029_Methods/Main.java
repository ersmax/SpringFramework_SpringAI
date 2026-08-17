package Section2_CoreJava.L029_Methods;

class Computer
{
    public void play() {
        System.out.println("Playing instruments");
    }

    public String returnValue(int value) {
        if (value >= 10) return "hello";
        return "Nothing";
    }
};


public class Main {
    public static void main(String[] args) {
        Computer aComputer = new Computer();
        aComputer.play();
        String value = aComputer.returnValue(10);
        System.out.println(value);

    }
}

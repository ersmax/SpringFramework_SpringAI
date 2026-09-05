package Section8_SpringFramework.L171_Autowiring;

public class Desktop implements Computer {

    public Desktop() {
        System.out.println("Desktop object created");
    }

    @Override
    public void compile() {
        System.out.println("Compiling on desktop");
    }
}

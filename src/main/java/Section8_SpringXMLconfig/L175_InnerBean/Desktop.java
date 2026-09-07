package Section8_SpringXMLconfig.L175_InnerBean;

public class Desktop implements Computer {

    public Desktop() {
        System.out.println("Desktop object created");
    }

    @Override
    public void compile() {
        System.out.println("Compiling on desktop");
    }
}

package Section9_JavaBasedConfig.L176_JavaBasedConfig;

public class Desktop implements Computer {

    public Desktop() {
        System.out.println("Desktop object created");
    }

    @Override
    public void compile() {
        System.out.println("Compiling on desktop");
    }
}

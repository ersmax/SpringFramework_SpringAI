package Section9_JavaBasedConfig.L178_ScopeAnnotation;

public class Desktop implements Computer {

    public Desktop() {
        System.out.println("Desktop object created");
    }

    @Override
    public void compile() {
        System.out.println("Compiling on desktop");
    }
}

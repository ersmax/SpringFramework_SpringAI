package Section9_JavaBasedConfig.L179_Autowire;

public class Laptop implements Computer {

    public Laptop() {
        System.out.println("Laptop object created");
    }

    @Override
    public void compile() {
        System.out.println("Compiling on laptop");
    }
}

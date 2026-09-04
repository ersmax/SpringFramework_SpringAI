package Section7_SpringBoot.L162_Autowiring;

import org.springframework.stereotype.Component;

@Component
public class Laptop {

    public void compile() {
        System.out.println("Compiling");
    }
}

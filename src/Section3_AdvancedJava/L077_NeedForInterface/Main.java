package Section3_AdvancedJava.L077_NeedForInterface;

interface Computer {
    void code();
}

class Laptop implements Computer {
    @Override
    public void code() {
        System.out.println("code, compile, run");
    }
}

class Desktop implements Computer {
    @Override
    public void code() {
        System.out.println("code, compile, run: faster");
    }
}

class Developer {
    public void devApp(Computer comp) {
        comp.code();
    }
}

public class Main {
    public static void main(String[] args) {
        // interface references
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        // class reference
        Developer dev = new Developer();

        dev.devApp(desk);
        dev.devApp(lap);
    }
}

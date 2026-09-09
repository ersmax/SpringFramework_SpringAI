package Section10_SpringBoot.L188_ServiceClass.service;

import Section10_SpringBoot.L188_ServiceClass.model.Laptop;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
public class LaptopService {

    public LaptopService() {
        System.out.println("LaptopService object created");
    }

    public void addLaptop(Laptop lap) {
        System.out.println("Adding a new laptop");
    }

    public boolean isGoodForProgramming(Laptop laptop) {
        return true;
    }
}

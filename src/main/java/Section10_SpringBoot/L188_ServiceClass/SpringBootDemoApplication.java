package Section10_SpringBoot.L188_ServiceClass;

import Section10_SpringBoot.L188_ServiceClass.model.Alien;
import Section10_SpringBoot.L188_ServiceClass.model.Laptop;
import Section10_SpringBoot.L188_ServiceClass.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);

        LaptopService service = context.getBean(LaptopService.class);
        Laptop lap = context.getBean(Laptop.class);
        service.addLaptop(lap);
        System.out.println("Is good for programming? " + service.isGoodForProgramming(lap));

    }
}

package Section9_JavaBasedConfig.L182_AutowireFieldConstructorSetter;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("Section9_JavaBasedConfig.L182_AutowireFieldConstructorSetter")
public class AppConfig {

//    @Bean(name = {"desktopComputer", "desktopPc"})
//    @Scope(value = "prototype")
//    public Desktop desktop(){
//        return new Desktop();
//    }
//
//    @Bean(name = {"laptopComputer", "laptopPc"})
//    @Scope(value = "prototype")
//    public Laptop laptop() {
//        return new Laptop();
//    }
//
//    @Bean(name = {"alien", "programmer"})
//    @Scope(value = "prototype")
//    public Alien alien(@Autowired Computer com){
//        Alien obj = new Alien();
//        obj.setAge(100);
//        obj.setComp(com);
//        return obj;
//    }

}

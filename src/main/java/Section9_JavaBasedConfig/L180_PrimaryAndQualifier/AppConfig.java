package Section9_JavaBasedConfig.L180_PrimaryAndQualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name = {"desktopComputer", "desktopPc"})
    @Scope(value = "prototype")
    public Desktop desktop(){
        return new Desktop();
    }

    @Bean(name = {"laptopComputer", "laptopPc"})
    @Scope(value = "prototype")
    public Laptop laptop() {
        return new Laptop();
    }

    @Bean(name = {"alien", "programmer"})
    @Scope(value = "prototype")
    public Alien alien(@Qualifier("laptopPc") @Autowired Computer com){
        Alien obj = new Alien();
        obj.setAge(100);
        obj.setComp(com);
        return obj;
    }
    // 2nd way:
    //    @Bean(name = {"alien", "programmer"})
    //    @Scope(value = "prototype")
    //    public Alien alien(@Qualifier("laptopPc") @Autowired Computer com){
    //        Alien obj = new Alien();
    //        obj.setAge(100);
    //        obj.setComp(com);
    //        return obj;
    //    }
}

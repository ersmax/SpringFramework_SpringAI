package Section9_JavaBasedConfig.L179_Autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name = {"computer", "desktopComputer", "laptop"})
    @Scope(value = "prototype")
    public Desktop desktop(){
        return new Desktop();
    }

    @Bean(name = {"alien", "programmer"})
    @Scope(value = "prototype")
    public Alien alien(@Autowired Computer com){
        Alien obj = new Alien();
        obj.setAge(100);
        obj.setComp(com);
        return obj;
    }
}

package Section12_SpringBootWeb.L207_Mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homepage() {
        System.out.println("homepage() method called");
        return "Section12/index.jsp";
    }
}

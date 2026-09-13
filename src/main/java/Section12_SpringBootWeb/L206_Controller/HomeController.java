package Section12_SpringBootWeb.L206_Controller;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
    public String homepage() {
        return "index.jsp";
    }
}

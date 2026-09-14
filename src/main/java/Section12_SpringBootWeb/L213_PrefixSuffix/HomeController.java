package Section12_SpringBootWeb.L213_PrefixSuffix;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homepage() {
        System.out.println("homepage() method called");
        return "index";
    }

    @RequestMapping("add")
    public String add(@RequestParam("num1") int n1, @RequestParam("num2") int n2, Model model) {
        int result = n1 + n2;
        model.addAttribute("result", result);
        return "result";
    }

}

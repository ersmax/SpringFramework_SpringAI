package Section12_SpringBootWeb.L217_SpringThymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homepage() {
        System.out.println("homepage() method called");
        return "indexAlien";
    }

    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int n1, @RequestParam("num2") int n2, ModelAndView modelView) {
        int result = n1 + n2;
        modelView.addObject("result", result);
        modelView.setViewName("result");
        return modelView;
    }

    @RequestMapping("addAlien")
    public String addAlien(@ModelAttribute Alien alien) {
        return "showAlienAndCourse";
    }

    @ModelAttribute("course")
    public String courseName() {
        return "Java";
    }
}

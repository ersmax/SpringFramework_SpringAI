package Section12_SpringBootWeb.L216_UseModelAttribute;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
    public String addAlien(Alien alien) {
        return "showAlienAndCourse";
    }

    @ModelAttribute("course")
    public String courseName() {
        return "Java";
    }

//    @RequestMapping("/addAlien")
//    public String addAlien(@RequestParam("aname") String name, @RequestParam("aid") int id, Model model) {
//        Alien alien = new Alien();
//        alien.setAid(id);
//        alien.setAname(name);
//        model.addAttribute("alien", alien);
//        return "showAlienAndCourse";
//    }

//    @RequestMapping("addAlien")
//    public ModelAndView addAlien(@RequestParam("aname") String name, @RequestParam("aid") int id, ModelAndView modelView) {
//        Alien alien = new Alien();
//        alien.setAname(name);
//        alien.setAid(id);
//        modelView.addObject("alien", alien);
//        modelView.setViewName("showAlienAndCourse");
//        return modelView;
//    }

    @Controller
    public class WelcomeController {
        @GetMapping("/welcome")
        public String welcome(Model model) {
            model.addAttribute("message", "Welcome to Telusko!");
            return "welcome-page";
        }
    }
}

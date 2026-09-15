package Section12_SpringBootWeb.L215_ModelAttribute;

import org.springframework.stereotype.Controller;
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
    public ModelAndView addAlien(@RequestParam("aid") int alienId, @RequestParam("aname") String alienName, ModelAndView modelView) {
        Alien alien = new Alien();
        alien.setAlienId(alienId);
        alien.setAlienName(alienName);

        modelView.addObject("alien", alien);
        modelView.setViewName("showAlien");
        return modelView;
    }

}

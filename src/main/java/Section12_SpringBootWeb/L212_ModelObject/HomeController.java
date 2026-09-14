package Section12_SpringBootWeb.L212_ModelObject;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homepage() {
        System.out.println("homepage() method called");
        return "Section12/index.jsp";
    }

    @RequestMapping("add")
    public String add(@RequestParam("num1") int n1, @RequestParam("num2") int n2, Model model) {
//        int num1 = Integer.parseInt(request.getParameter("num1"));
//        int num2 = Integer.parseInt(request.getParameter("num2"));
        int result = n1 + n2;
        model.addAttribute("result", result);
//        session.setAttribute("result", result);
        return "Section12/result.jsp";
    }

}

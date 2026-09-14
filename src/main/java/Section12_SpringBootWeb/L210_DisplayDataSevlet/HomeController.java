package Section12_SpringBootWeb.L210_DisplayDataSevlet;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homepage() {
        System.out.println("homepage() method called");
        return "Section12/index.jsp";
    }

    @RequestMapping("add")
    public String add(HttpServletRequest request, HttpSession session) {
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        int result = num1 + num2;
        session.setAttribute("result", result);
        return "Section12/result.jsp";
    }

}

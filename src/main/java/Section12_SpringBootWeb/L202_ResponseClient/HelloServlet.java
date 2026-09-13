package Section12_SpringBootWeb.L202_ResponseClient;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("In service");
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        response.getWriter().println("<h1>你好宝宝</h1>");  // get hold of the "pen" - writer

        PrintWriter out = response.getWriter();
        out.println("<h2>猪猪爱你</h2>");
    }
}

package Section12_SpringBootWeb.L202_ResponseClient;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class HomeServlet extends HttpServlet {

    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {

        System.out.println("In homepage");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>My homepage</h1>");


    }
}

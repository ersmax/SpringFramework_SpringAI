package Section12_SpringBootWeb.L201_ServletMapping;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;

public class App {

    public static void main(String[] args) throws LifecycleException {
        System.out.println("App started");
        Connector connector = new Connector();
        connector.setPort(8080);    // set desired port for your server

        Tomcat tomcat = new Tomcat();

        Context context = tomcat.addContext("", null);
        Tomcat.addServlet(context, "HelloServlet", new HelloServlet());
        context.addServletMapping("/hello", "HelloServlet");

        tomcat.getService().addConnector(connector);
//        tomcat.getConnector().setPort(8080);
        tomcat.start();
        tomcat.getServer().await(); // keep tomcat running
    }
}

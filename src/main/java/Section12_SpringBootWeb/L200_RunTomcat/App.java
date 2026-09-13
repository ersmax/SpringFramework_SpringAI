package Section12_SpringBootWeb.L200_RunTomcat;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App {

    public static void main(String[] args) throws LifecycleException {
        System.out.println("App started");
        Tomcat tomcat = new Tomcat();
        tomcat.start();
        tomcat.getServer().await(); // keep tomcat running
    }
}

package Section6_Hibernate.L153_L2ehCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        // - We use an XML config file for the configuration,
        //   and we need to map the config to the class to use Hibernate on the class
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Laptop.class);
        configuration.configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        // Query executed only once, because we are in the same session
        // and query is cached in L1 memory
        Laptop lap1 = session.find(Laptop.class, 2);
        System.out.println(lap1);
        Laptop lap2 = session.find(Laptop.class, 2);
        System.out.println(lap2);
        session.close();

        // Query executed twice, because they are in different sessions
        Session session1 = sessionFactory.openSession();
        Laptop laptop1 = session1.find(Laptop.class, 2);
        System.out.println(laptop1);
        session1.close();
        Session session2 = sessionFactory.openSession();
        Laptop laptop2 = session2.find(Laptop.class, 2);
        System.out.println(laptop2);
        session2.close();

        sessionFactory.close();
    }
}

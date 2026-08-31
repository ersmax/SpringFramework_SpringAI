package Section6_Hibernate.L152_GetVsLoad;

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

        // FETCH Data eager
        Laptop laptop = session.find(Laptop.class, 2);
//        System.out.println(laptop);

        // FETCH Data lazy
        Laptop lap = session.getReference(Laptop.class, 2);
//        System.out.println(lap);


        session.close();
        sessionFactory.close();
    }
}

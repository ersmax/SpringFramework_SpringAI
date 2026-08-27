package Section6_Hibernate.L139_FetchingData;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        // - We use an XML config file for the configuration,
        //   and we need to map the config to the class to use Hibernate on the class
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Student.class);
        configuration.configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        // FETCH: Specify the return type, and the key
        Student stud = session.find(Student.class, 1);

        session.close();
        sessionFactory.close();

        System.out.println(stud);
    }
}

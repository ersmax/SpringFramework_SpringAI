package Section6_Hibernate.L135_FailedAttemptSaveData;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Paul");
        s1.setAge(10);
        s1.setRollNumber(1020);

        // We need to specify in the configuration the
        // username, pwd, server address and port of DBMS
        Configuration configuration = new Configuration();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.persist(s1);


        System.out.println(s1);
    }
}

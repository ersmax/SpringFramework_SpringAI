package Section6_Hibernate.L136_SuccessfulSaveData;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setSid(3);
        s1.setName("John");
        s1.setMarks(99);


        // - We use an XML config file for the configuration,
        //   and we need to map the config to the class to use Hibernate on the class
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Student.class);

        configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        // Save is not the only step, you need to open a transaction that allows
        // to initiate the save and commit the save
        Transaction transaction = session.beginTransaction();
        session.persist(s1);
        transaction.commit();



        System.out.println(s1);
    }
}

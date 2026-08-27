package Section6_Hibernate.L140_UpdateData;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        // New parameters
        Student stud = new Student();
        stud.setName("Alex");
        stud.setSid(2);
        stud.setMarks(30);

        // New student: it's added as new, if it is not identified by a primary key
        // so it works as update of hibernate.cfg.xml
        Student newStud = new Student();
        newStud.setName("Jonathan");
        newStud.setSid(10);
        newStud.setMarks(67);

        // - We use an XML config file for the configuration,
        //   and we need to map the config to the class to use Hibernate on the class
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Student.class);
        configuration.configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        // UPDATE data
        // you need to open a transaction that allows
        // to initiate the save and commit the save
        Transaction transaction = session.beginTransaction();
        session.merge(stud);
        session.merge(newStud);
        transaction.commit();
        session.close();

        // DELETE data
        // TODO

        sessionFactory.close();



        System.out.println(stud);
    }
}

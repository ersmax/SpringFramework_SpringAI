package Section6_Hibernate.L147_LazyEagerValuation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Laptop l1 = new Laptop();
        l1.setLid(1);
        l1.setBrand("Asus");
        l1.setModel("ROG");
        l1.setRam(16);

        Laptop l2 = new Laptop();
        l2.setLid(2);
        l2.setBrand("Lenovo");
        l2.setModel("Legion");
        l2.setRam(32);

        Laptop l3 = new Laptop();
        l3.setLid(3);
        l3.setBrand("Dell");
        l3.setModel("XPS");
        l3.setRam(24);

        // New Alien: it's added as new, if it is not identified by a primary key
        // so it works as update tables of hibernate.cfg.xml
        Alien a1 = new Alien();
        a1.setAid(101);
        a1.setAname("Nathan");
        a1.setTech("Java");

        Alien a2 = new Alien();
        a2.setAid(102);
        a2.setAname("Kiran");
        a2.setTech("C++");

        // Set ownership of the laptops
        a1.setLaptop(Arrays.asList(l1, l2));
        a2.setLaptop(Arrays.asList(l3));

        // - We use an XML config file for the configuration,
        //   and we need to map the config to the class to use Hibernate on the class
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Laptop.class);
        configuration.addAnnotatedClass(Alien.class);
        configuration.configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        // CREATE data
        Transaction transaction = session.beginTransaction();
        session.persist(l1);
        session.persist(l2);
        session.persist(l3);
        session.persist(a1);
        session.persist(a2);
        transaction.commit();
        System.out.println("First transaction done");

        // Fetch data
        Alien alien = session.find(Alien.class, 101);
        System.out.println(alien);
        session.close();

        Session session2 = sessionFactory.openSession();
        Alien alien2 = session2.find(Alien.class, 102);
//        System.out.println(alien2);

        session2.close();
        sessionFactory.close();
    }
}

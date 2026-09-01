package Section6_Hibernate.L149_FetchingColumns;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Laptop lap1 = new Laptop();
        lap1.setLid(1);
        lap1.setBrand("Asus");
        lap1.setModel("ROG");
        lap1.setRam(16);

        Laptop lap2 = new Laptop();
        lap2.setLid(2);
        lap2.setBrand("Asus");
        lap2.setModel("Zephyrus");
        lap2.setRam(32);

        Laptop lap3 = new Laptop();
        lap3.setLid(3);
        lap3.setBrand("Dell");
        lap3.setModel("XPS");
        lap3.setRam(32);

        Laptop lap4 = new Laptop();
        lap4.setLid(4);
        lap4.setBrand("Dell");
        lap4.setModel("Alienware");
        lap4.setRam(16);

        Alien programmer1 = new Alien();
        programmer1.setAid(1);
        programmer1.setAname("John");
        programmer1.setTech("Java");

        Alien programmer2 = new Alien();
        programmer2.setAid(2);
        programmer2.setAname("Alex");
        programmer2.setTech("Java");

        // Set ownership of the laptops
        programmer1.setLaptop(Arrays.asList(lap1, lap3));
        programmer2.setLaptop(Arrays.asList(lap2, lap4));
        lap1.setAlien(programmer1);
        lap2.setAlien(programmer2);
        lap3.setAlien(programmer1);
        lap4.setAlien(programmer2);

        // - We use an XML config file for the configuration,
        //   and we need to map the config to the class to use Hibernate on the class
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Laptop.class);
        configuration.addAnnotatedClass(Alien.class);
        configuration.configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        // COMMIT data
        Transaction transaction = session.beginTransaction();
        session.persist(lap1);
        session.persist(lap2);
        session.persist(lap3);
        session.persist(lap4);
        session.persist(programmer1);
        session.persist(programmer2);
        transaction.commit();

        // FETCH data
        Laptop theLaptop = session.find(Laptop.class, 3);
        System.out.println(theLaptop);

        // select * from laptop where brand LIKE 'Asus' -> SQL
        // from laptop where brand LIKE 'Asus' -> HQL
        int minRam = 32;
        Query query = session.createQuery("from Laptop where ram >= ?1");
        query.setParameter(1, minRam);
        List<Laptop> laptops = query.getResultList();
        System.out.println(laptops);
        System.out.println("First transaction done");

        String brandName = "Dell";
        Query<String> query0 = session.createQuery("SELECT model FROM Laptop WHERE brand LIKE ?1", String.class);
        query0.setParameter(1, brandName);
        List<String> dellModels = query0.getResultList();
        System.out.println(dellModels);
        System.out.println("Second transaction done");

        String companyName = "Asus";
        Query<Object[]> query1 = session.createQuery("SELECT brand, model FROM Laptop WHERE brand LIKE ?1", Object[].class);
        query1.setParameter(1, companyName);
        List<Object[]> models = query1.getResultList();
        for (Object[] model : models)
            System.out.println((String)model[0] + " " + (String)model[1]);
        System.out.println("Third transaction done");

        String programmer = "John";
        int mininmRam = 32;
        // "SELECT l.brand, l.model FROM Laptop l JOIN l.alien a WHERE a.aname LIKE ?1 and l.ram >= ?2"
        // "SELECT brand, model FROM Laptop WHERE alien.aname LIKE ?1 and ram >= ?2"
        Query<Object[]> query2 = session.createQuery("SELECT brand, model FROM Laptop l JOIN l.alien a WHERE a.aname LIKE ?1 and l.ram >= ?2", Object[].class);
        query2.setParameter(1, programmer);
        query2.setParameter(2, mininmRam);
        List<Object[]> laptopsJohn = query2.getResultList();
        for (Object[] lap : laptopsJohn)
            System.out.println((String)lap[0] + " " + (String)lap[1]);
        System.out.println("Fourth transaction done");

        session.close();
        sessionFactory.close();
    }
}

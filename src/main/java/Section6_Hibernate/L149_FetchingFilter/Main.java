package Section6_Hibernate.L149_FetchingFilter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // - We use an XML config file for the configuration,
        //   and we need to map the config to the class to use Hibernate on the class
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Laptop.class);
        configuration.configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        // FETCH data
        Laptop theLaptop = session.find(Laptop.class, 3);
        System.out.println(theLaptop);

        // select * from laptop where brand LIKE 'Asus' -> SQL
        // from laptop where brand LIKE 'Asus' -> HQL
        String brand = "Asus";
        int minRam = 32;
        Query query = session.createQuery("from Laptop where ram >= ?1", Laptop.class);
        query.setParameter(1, minRam);
        List<Laptop> laptops = query.getResultList();
        System.out.println(laptops);

        System.out.println("First transaction done");


        session.close();
        sessionFactory.close();
    }
}

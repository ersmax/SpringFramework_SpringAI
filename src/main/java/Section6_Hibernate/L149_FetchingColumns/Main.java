package Section6_Hibernate.L149_FetchingColumns;

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
        int minRam = 32;
        Query query = session.createQuery("from Laptop where ram >= ?1");
        query.setParameter(1, minRam);
        List<Laptop> laptops = query.getResultList();
        System.out.println(laptops);
        System.out.println("First transaction done");

        String companyName = "Asus";
        Query query1 = session.createQuery("SELECT brand, model FROM Laptop WHERE brand LIKE ?1");
        query1.setParameter(1, companyName);
        List<Object[]> models = query1.getResultList();
        for (Object[] model : models)
            System.out.println((String)model[0] + " " + (String)model[1]);
        System.out.println("Second transaction done");


        session.close();
        sessionFactory.close();
    }
}

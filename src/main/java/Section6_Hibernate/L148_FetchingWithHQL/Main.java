package Section6_Hibernate.L148_FetchingWithHQL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Arrays;
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

        // select * from laptop where ram = 32 -> SQL
        // from laptop where ram = 32; -> HQL
        Query query = session.createQuery("from Laptop where ram >= 32", Laptop.class);
        List<Laptop> laptops = query.getResultList();
        System.out.println(laptops);

        System.out.println("First transaction done");


        session.close();
        sessionFactory.close();
    }
}

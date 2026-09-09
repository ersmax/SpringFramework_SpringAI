package Section10_SpringBoot.L189_RepositoryLayer.repo;

import Section10_SpringBoot.L189_RepositoryLayer.model.Laptop;
import org.springframework.stereotype.Repository;

/**
 * This class is responsible to connect with the DB
 */
@Repository
public class LaptopRepository {

    public void save(Laptop laptop) {
        System.out.println("Saved in database...");
    }
}

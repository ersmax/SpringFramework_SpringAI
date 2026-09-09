package Section10_SpringBoot.L189_RepositoryLayer.service;

import Section10_SpringBoot.L189_RepositoryLayer.repo.LaptopRepository;
import Section10_SpringBoot.L189_RepositoryLayer.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
public class LaptopService {

    private LaptopRepository repo;

    public LaptopService() {
        System.out.println("LaptopService object created");
    }

    public void addLaptop(Laptop lap) {
        System.out.println("Adding a new laptop");
        repo.save(lap);
    }

    public boolean isGoodForProgramming(Laptop laptop) {
        return true;
    }

    public LaptopRepository getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(LaptopRepository repo) {
        this.repo = repo;
    }
}

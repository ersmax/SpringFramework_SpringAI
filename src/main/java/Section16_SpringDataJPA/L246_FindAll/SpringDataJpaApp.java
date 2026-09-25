package Section16_SpringDataJPA.L246_FindAll;

import Section16_SpringDataJPA.L246_FindAll.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaApp {

    public static void main(String[] args) {
        // create an IoC container of objects
        ApplicationContext context = SpringApplication.run(SpringDataJpaApp.class, args);
        // beans are created with run()
        Student s1 = context.getBean(Student.class);
        Student s2 = context.getBean(Student.class);
        Student s3 = context.getBean(Student.class);

        s1.setRollNo(101);
        s1.setName("Quick");
        s1.setMarks(100);

        s2.setRollNo(102);
        s2.setName("Quock");
        s2.setMarks(98);

        s3.setRollNo(103);
        s3.setName("Quack");
        s3.setMarks(87);

        StudentRepo repo = context.getBean(StudentRepo.class);
        // works if Student has annotation @Entity
        // and application.properties has the config of creating/updating the tables
        repo.save(s1);
        repo.save(s2);
        repo.save(s3);

        // Fetch all records
        System.out.println(repo.findAll());
    }
}

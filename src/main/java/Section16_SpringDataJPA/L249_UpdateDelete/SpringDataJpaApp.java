package Section16_SpringDataJPA.L249_UpdateDelete;

import Section16_SpringDataJPA.L249_UpdateDelete.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

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

        // Send data
        StudentRepo repo = context.getBean(StudentRepo.class);
        // works if Student has annotation @Entity
        // and application.properties has the config of creating/updating the tables
        repo.save(s1);
        repo.save(s2);
        repo.save(s3);

        // Fetch all records
        System.out.println(repo.findAll());

        // Retrieve one ID
        System.out.println(repo.findById(101));

        // Return an Optional to handle Null Pointer Exception
        // In this case, it returns Optional.empty
        System.out.println(repo.findById(104));

        // If no object is found, create a new one
        // prints Student{rollNo=0, name='null', marks=0}
        Optional<Student> stud = repo.findById(104);
        System.out.println(stud.orElse(new Student()));

        // Fetch data based on an object attribute
        System.out.println(repo.findByName("Quick"));

        // Fetch data based on marks
        System.out.println(repo.findByMarks(17));

        // Fetch data based on marks
        System.out.println(repo.findByMarksGreaterThan(80));


        // update data for Quick: he cheated
        Student quick = repo.findByName("Quick").getFirst();
        quick.setMarks(0);
        repo.save(quick);
        System.out.println(repo.findAll());

        // delete Quick once and for good
        repo.delete(quick);
        System.out.println(repo.findAll());
    }
}

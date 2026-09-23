package Section16_SpringDataJPA.L245_CreateTableInsertData;

import Section16_SpringDataJPA.L245_CreateTableInsertData.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaApp {

    public static void main(String[] args) {

        // create an IoC container of objects
        ApplicationContext context = SpringApplication.run(SpringDataJpaApp.class, args);

        Student s1 = context.getBean(Student.class);
        Student s2 = context.getBean(Student.class);
        Student s3 = context.getBean(Student.class);

        s1.setRollNo(101);
        s1.setName("Quick");
        s1.setMarks(100);

        s2.setRollNo(101);
        s2.setName("Quo ck");
        s2.setMarks(98);

        s3.setRollNo(101);
        s3.setName("Quack");
        s3.setMarks(87);

        StudentRepo repo = context.getBean(StudentRepo.class);
        repo.save(s1);  // works if Student has annotation @Entity
    }
}

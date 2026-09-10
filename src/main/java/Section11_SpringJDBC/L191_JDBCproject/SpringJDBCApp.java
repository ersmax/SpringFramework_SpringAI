package Section11_SpringJDBC.L191_JDBCproject;

import Section11_SpringJDBC.L191_JDBCproject.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJDBCApp {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringJDBCApp.class, args);

        Student stud = context.getBean(Student.class);
        stud.setRollNo(101);
        stud.setName("Pippo");
        stud.setMarks(100);
    }
}

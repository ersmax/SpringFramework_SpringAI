package Section11_SpringJDBC.L196_SpringJDBCpostegres;

import Section11_SpringJDBC.L196_SpringJDBCpostegres.model.Student;
import Section11_SpringJDBC.L196_SpringJDBCpostegres.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

/**
 * Application layer.
 * With new DBMS nothing changes much,
 * just the POM and the application.properties
 */
@SpringBootApplication
public class SpringJDBCApp {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringJDBCApp.class, args);

        Student stud = context.getBean(Student.class);
        stud.setRollNo(104);
        stud.setName("Pippo");
        stud.setMarks(100);

        Student stud2 = context.getBean(Student.class);
        stud2.setRollNo(105);
        stud2.setName("Pluto");
        stud2.setMarks(99);

        StudentService studService = context.getBean(StudentService.class);
        studService.addStudent(stud);
        studService.addStudent(stud2);

        List<Student> students = studService.getStudents();
        System.out.println(students);

        Student student101 = studService.getStudent(101);
        System.out.println(student101);
    }
}

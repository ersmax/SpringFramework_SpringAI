package Section11_SpringJDBC.L192_ServiceRepoLayers;

import Section11_SpringJDBC.L192_ServiceRepoLayers.model.Student;
import Section11_SpringJDBC.L192_ServiceRepoLayers.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJDBCApp {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringJDBCApp.class, args);

        Student stud = context.getBean(Student.class);
        stud.setRollNo(101);
        stud.setName("Pippo");
        stud.setMarks(100);

        Student stud2 = context.getBean(Student.class);
        stud2.setRollNo(102);
        stud2.setName("Pluto");
        stud2.setMarks(99);

        StudentService studService = context.getBean(StudentService.class);
        studService.addStudent(stud);
        studService.addStudent(stud2);

        List<Student> students = studService.getStudents();
        System.out.println(students);
    }
}

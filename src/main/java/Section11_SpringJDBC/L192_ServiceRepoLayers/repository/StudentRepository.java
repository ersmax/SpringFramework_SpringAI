package Section11_SpringJDBC.L192_ServiceRepoLayers.repository;


import Section11_SpringJDBC.L192_ServiceRepoLayers.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    public void save(Student stud) {
        System.out.println("Student added...");
    }

    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        return students;
    }
}

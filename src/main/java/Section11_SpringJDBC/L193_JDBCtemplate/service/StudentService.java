package Section11_SpringJDBC.L193_JDBCtemplate.service;

import Section11_SpringJDBC.L193_JDBCtemplate.model.Student;
import Section11_SpringJDBC.L193_JDBCtemplate.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service layer
 */
@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentRepository getStudentRepository() {
        return studentRepository;
    }

    @Autowired
    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void addStudent(Student stud) {
        studentRepository.save(stud);
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }
}

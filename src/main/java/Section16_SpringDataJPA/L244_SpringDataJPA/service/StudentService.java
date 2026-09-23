package Section16_SpringDataJPA.L244_SpringDataJPA.service;

import Section16_SpringDataJPA.L244_SpringDataJPA.model.Student;
import Section16_SpringDataJPA.L244_SpringDataJPA.repository.StudentRepository;
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

    public Student getStudent(int id) {
        return studentRepository.findStudent(id);
    }
}

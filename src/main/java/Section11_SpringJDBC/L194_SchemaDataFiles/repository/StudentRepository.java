package Section11_SpringJDBC.L194_SchemaDataFiles.repository;


import Section11_SpringJDBC.L194_SchemaDataFiles.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Repo layer
 */
@Repository
public class StudentRepository {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student stud) {
        String sql = "INSERT INTO student (rollno, name, marks) VALUES (?, ?, ?)";
        int rows = jdbc.update(sql, stud.getRollNo(), stud.getName(), stud.getMarks());
        System.out.println("Students added: " + rows);
    }

    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        return students;
    }
}

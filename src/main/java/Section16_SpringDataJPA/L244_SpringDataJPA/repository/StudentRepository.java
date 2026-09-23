package Section16_SpringDataJPA.L244_SpringDataJPA.repository;


import Section16_SpringDataJPA.L244_SpringDataJPA.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

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
        String sql = "INSERT INTO student (roll, name, marks) VALUES (?, ?, ?)";
        int rows = jdbc.update(sql, stud.getRollNo(), stud.getName(), stud.getMarks());
        System.out.println("Students added: " + rows);
    }

    /**
     * ResultSet rs: The result of the SQL query containing the data.
     * mapRow is executed for each row in the ResultSet
     * @return of mapRow ->  It returns a Java object representing the current row,
     * populated with data from the ResultSet
     */
    public List<Student> findAll() {
        String sql = "SELECT * FROM student";
        RowMapper<Student> mapper = (rs, rowNum) -> {
            Student stud = new Student();
            stud.setRollNo(rs.getInt("roll"));
            stud.setName(rs.getString("name"));
            stud.setMarks(rs.getInt("marks"));
            return stud;
        };
        return jdbc.query(sql, mapper);
    }
    //        RowMapper<Student> mapper = new RowMapper<Student>() {
    //            @Override
    //            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
    //                Student stud = new Student();
    //                stud.setRollNo(rs.getInt("roll"));
    //                stud.setName(rs.getString("name"));
    //                stud.setMarks(rs.getInt("marks"));
    //
    //                return stud;
    //            }
    //        };
    //        return jdbc.query(sql, mapper);
    //    }

    public Student findStudent(int idStud) {
        String sql = "SELECT * FROM student WHERE roll = ?";
        RowMapper<Student> mapper = (rs, rowNum) -> {
            Student stud = new Student();
            stud.setRollNo(rs.getInt("roll"));
            stud.setName(rs.getString("name"));
            stud.setMarks(rs.getInt("marks"));
            return stud;
        };
        return jdbc.queryForObject(sql, mapper, idStud);
    }

//    public Student findStudent(int idStud) {
//        String sql = "SELECT * FROM student WHERE roll = ?";
//        RowMapper<Student> mapper = new RowMapper<Student>() {
//            @Override
//            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//                Student stud = new Student();
//                stud.setRollNo(rs.getInt("roll"));
//                stud.setName(rs.getString("name"));
//                stud.setMarks(rs.getInt("marks"));
//                return stud;
//            }
//        };
//        return jdbc.queryForObject(sql, mapper, idStud);
//    }
}

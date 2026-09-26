package Section16_SpringDataJPA.L249_UpdateDelete;

import Section16_SpringDataJPA.L249_UpdateDelete.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

//    @Query("SELECT s from Student s WHERE s.name = ?1")
//    List<Student> findByName(String name);

    // the annotation is not needed for "name" property
    List<Student> findByName(String name);

    //    @Query("SELECT s from Student s WHERE s.marks = ?1")
    List<Student> findByMarks(int marks);

    //    @Query("SELECT s FROM Student s WHERE s.marks > ?1")
    List<Student> findByMarksGreaterThan(int marks);
}

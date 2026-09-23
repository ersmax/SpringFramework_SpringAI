package Section16_SpringDataJPA.L245_CreateTableInsertData;

import Section16_SpringDataJPA.L245_CreateTableInsertData.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
}

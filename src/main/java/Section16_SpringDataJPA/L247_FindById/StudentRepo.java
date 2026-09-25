package Section16_SpringDataJPA.L247_FindById;

import Section16_SpringDataJPA.L247_FindById.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
}

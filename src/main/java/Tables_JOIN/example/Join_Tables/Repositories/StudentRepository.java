package Tables_JOIN.example.Join_Tables.Repositories;

import Tables_JOIN.example.Join_Tables.Entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {}


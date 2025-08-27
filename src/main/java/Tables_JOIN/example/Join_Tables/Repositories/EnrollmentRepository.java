package Tables_JOIN.example.Join_Tables.Repositories;


import Tables_JOIN.example.Join_Tables.Entities.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {}


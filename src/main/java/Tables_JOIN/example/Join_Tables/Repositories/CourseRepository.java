package Tables_JOIN.example.Join_Tables.Repositories;


import Tables_JOIN.example.Join_Tables.Entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {}


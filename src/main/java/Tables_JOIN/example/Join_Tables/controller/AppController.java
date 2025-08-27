package Tables_JOIN.example.Join_Tables.controller;

import Tables_JOIN.example.Join_Tables.Entities.Course;
import Tables_JOIN.example.Join_Tables.Entities.Enrollment;
import Tables_JOIN.example.Join_Tables.Entities.Student;
import Tables_JOIN.example.Join_Tables.Repositories.CourseRepository;
import Tables_JOIN.example.Join_Tables.Repositories.EnrollmentRepository;
import Tables_JOIN.example.Join_Tables.Repositories.StudentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AppController {
    private final StudentRepository studentRepo;
    private final CourseRepository courseRepo;
    private final EnrollmentRepository enrollmentRepo;

    public AppController(StudentRepository studentRepo, CourseRepository courseRepo, EnrollmentRepository enrollmentRepo) {
        this.studentRepo = studentRepo;
        this.courseRepo = courseRepo;
        this.enrollmentRepo = enrollmentRepo;
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        return studentRepo.save(student);
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course) {
        return courseRepo.save(course);
    }

    @PostMapping("/enroll")
    public Enrollment enroll(@RequestParam Long studentId, @RequestParam Long courseId, @RequestParam String semester) {
        Student student = studentRepo.findById(studentId).orElseThrow();
        Course course = courseRepo.findById(courseId).orElseThrow();
        Enrollment enrollment = new Enrollment();
        enrollment.setStudent(student);
        enrollment.setCourse(course);
        enrollment.setSemester(semester);
        return enrollmentRepo.save(enrollment);
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentRepo.findAll();
    }
}


package cat.cifo.enrollment;
import cat.cifo.enrollment.model.*;
import cat.cifo.enrollment.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private EnrollmentRepository enrollmentRepository;

    @Override
    public void run(String... args) {

        Student s1 = new Student("S001", "Oscar Pareja", 25);
        Student s2 = new Student("S002", "Laura Solero", 25);

        Teacher t1 = new Teacher("T001", "Albert Profe");
        Teacher t2 = new Teacher("T002", "Joan Callis");

        studentRepository.save(s1);
        studentRepository.save(s2);

        teacherRepository.save(t1);
        teacherRepository.save(t2);

        enrollmentRepository.save(new Enrollment("E001", "Java", s1, t1));
        enrollmentRepository.save(new Enrollment("E002", "Spring Boot", s2, t1));
        enrollmentRepository.save(new Enrollment("E003", "React", s1, t2));
        }
    }





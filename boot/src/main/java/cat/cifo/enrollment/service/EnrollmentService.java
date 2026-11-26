package cat.cifo.enrollment.service;

import cat.cifo.enrollment.model.Enrollment;
import org.springframework.stereotype.Service;
import java.util.List;
import cat.cifo.enrollment.model.Student;
import cat.cifo.enrollment.model.Teacher;
import cat.cifo.enrollment.repository.EnrollmentRepository;
import cat.cifo.enrollment.repository.StudentRepository;
import cat.cifo.enrollment.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class EnrollmentService {

    @Autowired
    private EnrollmentRepository enrollmentRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private TeacherRepository teacherRepository;

    public List<Enrollment> findAll() {
        return enrollmentRepository.findAll();
    }

    public Enrollment create(String studentId, String teacherId) {

        Student student = studentRepository.findById(studentId).orElseThrow();
        Teacher teacher = teacherRepository.findById(teacherId).orElseThrow();

        Enrollment enrollment = new Enrollment();

        enrollment.setStudent(student);
        enrollment.setTeacher(teacher);

        return enrollmentRepository.save(enrollment);
    }

    public void delete(String id) {
        enrollmentRepository.deleteById(id);
    }
}
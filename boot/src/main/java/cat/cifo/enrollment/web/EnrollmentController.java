package cat.cifo.enrollment.web;
import cat.cifo.enrollment.model.Enrollment;
import cat.cifo.enrollment.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

// TODO (MF04): endpoints REST per a les matrícules (enrollments).
// Proveu-los amb Postman i poseu l'enllaç públic de la col·lecció
// al fitxer Markdown de doc/ d'aquesta branca (no al full de la prova).


@RestController
@RequestMapping("/api/enrollments")
public class EnrollmentController {

    @Autowired
    private EnrollmentService enrollmentService;

    @GetMapping("/getAll")
    public List<Enrollment> findAll() {
        return enrollmentService.findAll();
    }

    @PostMapping ("/create")
    public Enrollment create(@RequestBody Enrollment enrollment) {
        return enrollmentService.create(
                enrollment.getStudent().getId(),
                enrollment.getTeacher().getId()
        );
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Enrollment enrollment) {
        enrollmentService.delete(enrollment.getId());
    }
}







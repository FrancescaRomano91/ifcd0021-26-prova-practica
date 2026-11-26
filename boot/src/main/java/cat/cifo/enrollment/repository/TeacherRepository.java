package cat.cifo.enrollment.repository;

import cat.cifo.enrollment.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

// TODO (MF03): interface TeacherRepository extends JpaRepository<Teacher, Long> { }
// No calen consultes pròpies (@Query o derived queries).
public interface TeacherRepository extends JpaRepository<Teacher, String> {
}

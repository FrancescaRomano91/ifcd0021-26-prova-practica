package cat.cifo.enrollment.repository;
import cat.cifo.enrollment.model.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// TODO (MF03): interface EnrollmentRepository extends JpaRepository<Enrollment, Long> { }
// No calen consultes pròpies (@Query o derived queries).

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, String> {
}

package cat.cifo.enrollment.repository;

import cat.cifo.enrollment.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// TODO (MF03): interface StudentRepository extends JpaRepository<Student, Long> { }
// No calen consultes pròpies (@Query o derived queries).

@Repository
    public interface StudentRepository extends JpaRepository <Student, String>{

}

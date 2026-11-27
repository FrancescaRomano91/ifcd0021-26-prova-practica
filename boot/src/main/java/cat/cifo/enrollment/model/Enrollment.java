package cat.cifo.enrollment.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import jakarta.persistence.Entity;

// TODO (MF02): completeu la classe Enrollment (relació professor–estudiant i un camp extra,
//              per exemple assignatura o data).
// TODO (MF03): convertiu-la en @Entity amb dos @ManyToOne (Teacher i Student).
//              Expliqueu al full de la prova per què no feu servir @ManyToMany / @JoinTable.

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Enrollment {

    @Id
    private String id;
    private String subject;

    @ManyToOne
    @JoinColumn(name = "student_FK")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "teacher_FK")
    private Teacher teacher;


}

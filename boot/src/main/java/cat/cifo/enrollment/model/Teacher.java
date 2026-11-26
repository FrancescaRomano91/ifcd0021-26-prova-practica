package cat.cifo.enrollment.model;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;
import lombok.*;


import jakarta.persistence.Entity;

// TODO (MF02): completeu la classe Teacher (atributs, constructors, getters i setters).
// TODO (MF03): convertiu-la en @Entity (clau primària, relació amb Enrollment).

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {

    @Id
    private String id;
    private String name;


    @OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL, fetch = FetchType.LAZY)

    private List<Enrollment> enrollment = new ArrayList<>();


}

package cat.cifo.enrollment.model;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    private String id;
    private String name;
    private int age;


    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Enrollment> enrollment = new ArrayList<>();

}

// TODO (MF02): completeu la classe Student (atributs, constructors, getters i setters).
// TODO (MF03): convertiu-la en @Entity (clau primària, relació amb Enrollment).





package ma.aui.erp.hr.employeeservice.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
public class Gender extends BaseModel{
    @Id
    @Column(name = "gender_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long genderId;

    @Column(name = "binaryId")
    private Boolean binaryId;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "genderId")
    private Set<Employee> employeeSet;
}

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
public class EducationInstitution extends BaseModel{
    @Id
    @Column(name = "educationInstitution_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long educationInstitutionId;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "educationInstitutionId")
    private Set<Education> educationSet;
}

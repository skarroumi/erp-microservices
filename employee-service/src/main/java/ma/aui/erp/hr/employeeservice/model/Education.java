package ma.aui.erp.hr.employeeservice.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
public class Education extends BaseModel{
    @Id
    @Column(name = "education_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long educationId;

    @Column(name = "discipline")
    private String discipline;

    @Column(name = "edu_from")
    private Date eduFrom;

    @Column(name = "edu_to")
    private Date eduTo;

    @NotNull
    @ManyToMany(mappedBy = "educationSet")
    private Set<Employee> employeeSet;

    @ManyToOne
    @JoinColumn(name = "educationInstitution_id")
    private EducationInstitution educationInstitutionId;
}

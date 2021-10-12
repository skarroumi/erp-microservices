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
public class TotalExperience extends BaseModel{

    @Id
    @Column(name = "totalExpertiseId_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long totalExpertiseId;

    @Column(name = "duration")
    private double duration;

    @OneToMany(mappedBy = "totalExperienceId")
    private Set<Employee> employeeSet;
}

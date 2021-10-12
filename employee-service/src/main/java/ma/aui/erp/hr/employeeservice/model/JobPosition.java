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
public class JobPosition extends BaseModel{

    @Id
    @Column(name = "jobPosition_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jobPositionId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "jobPositionId")
    private Set<Employee> employeeSet;
}

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
public class Skill extends BaseModel{
    @Id
    @Column(name = "skill_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long skillId;

    @Column(name = "name")
    private String name;

    @ManyToMany (mappedBy = "skillSet")
    private Set<Employee> employeeSet;

}

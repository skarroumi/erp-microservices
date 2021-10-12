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
public class Bonus extends BaseModel{
    @Id
    @Column(name = "bonus_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bonusId;

    @Column(name = "name")
    private String name;

    @Column(name = "value")
    private double value;

    @ManyToMany (mappedBy = "bonusSet")
    private Set<Employee> employeeSet;
}

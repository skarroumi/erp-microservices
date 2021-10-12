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
public class MaritalStatus extends BaseModel{
    @Id
    @Column(name = "maritalStatus_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long maritalStatusId;

    @Column(name = "status")
    private String status;

    @Column(name = "children")
    private int children;

    @OneToMany(mappedBy = "maritalStatusId")
    private Set<Employee> employeeSet;
}

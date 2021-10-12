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
public class WorkLocation extends BaseModel{

    @Id
    @Column(name = "workLocation_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long workLocationId;

    @Column(name = "location")
    private String location;

    @OneToMany(mappedBy = "workLocationId")
    private Set<Employee> employeeSet;
}

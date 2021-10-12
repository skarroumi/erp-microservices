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
public class State extends BaseModel{
    @Id
    @Column(name = "state_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stateId;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "stateId")
    private Set<City> citySet;
}

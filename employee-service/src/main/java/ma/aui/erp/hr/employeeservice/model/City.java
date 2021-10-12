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
public class City extends BaseModel{
    @Id
    @Column(name = "city_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cityId;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "cityId")
    private Set<Address> addressSet;

    @ManyToOne
    @JoinColumn(name = "state_id")
    private State stateId;
}

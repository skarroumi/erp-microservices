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
public class Address extends BaseModel{
    @Id
    @Column(name = "address_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;

    @Column(name = "street")
    private String street;

    @Column(name = "zip")
    private int zip;

    @OneToMany(mappedBy = "addressId")
    private Set<Employee> employeeSet;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City cityId;
}

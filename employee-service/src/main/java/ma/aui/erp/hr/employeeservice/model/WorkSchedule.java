package ma.aui.erp.hr.employeeservice.model;

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
public class WorkSchedule extends BaseModel{

    @Id
    @Column(name = "workSchedule_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long workScheduleId;

    @Column(name = "date")
    private Date date;

    @Column(name = "start_time")
    private Date startTime;

    @Column(name = "end_time")
    private Date endTime;

    @ManyToMany(mappedBy = "workScheduleSet")
    private Set<Employee> employeeSet;

}

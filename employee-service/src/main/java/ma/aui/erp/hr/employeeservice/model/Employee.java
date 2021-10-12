package ma.aui.erp.hr.employeeservice.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sun.istack.NotNull;
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
@JsonInclude(JsonInclude.Include.NON_NULL)
@EqualsAndHashCode(callSuper = false)
@Table(name = "employee")
public class Employee extends BaseModel{

    private static final long serialVersionUID = 0;

    @Id
    @Column(name = "employee_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "join_date")
    private Date joinDate;

    @Column(name = "is_active")
    private Boolean isActive;

    @Column(name = "exit_date")
    private Date exitDate;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "rib")
    private String RIB;

    @Column(name = "photo_path")
    private String photoPath;

    @ManyToMany
    @JoinTable(
            name = "employee_bonus",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name="bonus_id")
    )
    private Set<Bonus> bonusSet;

    @ManyToMany
    @JoinTable(
            name = "employee_skill",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name="skill_id")
    )
    private Set<Skill> skillSet;

    @ManyToMany
    @JoinTable(
            name = "employee_language",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name="language_id")
    )
    private Set<Language> languageSet;

    @ManyToMany
    @JoinTable(
            name = "employee_education",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name="education_id")
    )
    private Set<Education> educationSet;

    @ManyToMany
    @JoinTable(
            name = "employee_workSchedule",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name="workSchedule_id")
    )
    private Set<WorkSchedule> workScheduleSet;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department departmentId;

    @ManyToOne
    @JoinColumn(name = "gender_id")
    private Gender genderId;

    @ManyToOne
    @JoinColumn(name = "maritalStatus_id")
    private MaritalStatus maritalStatusId;

    @ManyToOne
    @JoinColumn(name = "salary_id")
    private Salary salaryId;

    @ManyToOne
    @JoinColumn(name = "totalExperience_id")
    private TotalExperience totalExperienceId;

    @ManyToOne
    @JoinColumn(name = "workLocation_id")
    private WorkLocation workLocationId;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address addressId;

    @ManyToOne
    @JoinColumn(name = "jobPosition_id")
    private JobPosition jobPositionId;
}

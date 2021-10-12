package ma.aui.erp.hr.employeeservice.repository;

import ma.aui.erp.hr.employeeservice.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

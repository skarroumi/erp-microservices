package ma.aui.erp.hr.employeeservice.repository;

import ma.aui.erp.hr.employeeservice.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}

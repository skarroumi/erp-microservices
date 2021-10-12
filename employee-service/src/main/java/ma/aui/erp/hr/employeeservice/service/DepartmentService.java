package ma.aui.erp.hr.employeeservice.service;

import ma.aui.erp.hr.employeeservice.model.Department;
import ma.aui.erp.hr.employeeservice.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    // fetching all department
    public List<Department> getAllDepartments(){
        return departmentRepository.findAll();
    }

    // fetching department by id
    public Optional<Department> getDepartment(Long id){
        return departmentRepository.findById(id);
    }

    // inserting department
    public void addDepartment(Department department) {
        departmentRepository.save(department);
    }

    // updating department by id
    public void updateDepartment(Department department, Long id){
        if(id == department.getDepartmentId()) {
            departmentRepository.save(department);
        }
    }

    // deleting all departments
    public void deleteAllDepartment(){
        departmentRepository.deleteAll();
    }

    // deleting department by id
    public void deleteDepartmentByID(Long id){
        departmentRepository.deleteById(id);
    }

}

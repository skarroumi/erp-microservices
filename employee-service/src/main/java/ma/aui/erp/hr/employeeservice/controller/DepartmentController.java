package ma.aui.erp.hr.employeeservice.controller;

import ma.aui.erp.hr.employeeservice.model.Department;
import ma.aui.erp.hr.employeeservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    // displaying list of all department
    @GetMapping("/department")
    public List<Department> getAllDepartment(){
        return departmentService.getAllDepartments();
    }

    // displaying department by id
    @GetMapping("/department/{id}")
    public Optional<Department> getDepartment(@PathVariable Long id){
        return departmentService.getDepartment(id);
    }

    // inserting department
    @PostMapping("/department/new")
    public void addDepartment(@RequestBody Department department){
        departmentService.addDepartment(department);
    }

    //updating department by id
    @PutMapping("/department/{id}")
    public void updateDepartment(@RequestBody Department department, @PathVariable Long id){
        departmentService.updateDepartment(department, id);
    }

    // deleting all department
    @DeleteMapping("/department/all")
    public void deleteAllDepartments(){
        departmentService.deleteAllDepartment();
    }

    // delete department by id
    @DeleteMapping("department/{id}")
    public void deleteDepartmentByID(@RequestBody Department department, @PathVariable Long id){
        departmentService.deleteDepartmentByID(id);
    }

}

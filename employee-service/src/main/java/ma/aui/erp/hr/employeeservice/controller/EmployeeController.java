package ma.aui.erp.hr.employeeservice.controller;

import ma.aui.erp.hr.employeeservice.model.Employee;
import ma.aui.erp.hr.employeeservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // displaying list of all employees
    @GetMapping("/employee/all")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployees();
    }

    // displaying employee by id
    @GetMapping("/employee/{id}")
    public Optional<Employee> getEmployee(@PathVariable Long id){
        return employeeService.getEmployee(id);
    }

    // inserting employee
    @PostMapping("/employee/new")
    public void addEmployees(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
    }

    //update employee by id
    @PutMapping("/employee/{id}")
    public void updateEmployee(@RequestBody Employee employee, @PathVariable int id){
        employeeService.updateEmployee(employee, id);
    }

    // delete all employees
    @DeleteMapping("/employee/all")
    public void deleteAllEmployees(){
        employeeService.deleteAllEmployees();
    }

    // delete employee by id
    @DeleteMapping("employee/{id}")
    public void deleteEmployeeByID(@PathVariable Long id){
        employeeService.deleteEmployeeByID(id);
    }

}

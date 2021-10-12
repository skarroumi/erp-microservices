package ma.aui.erp.hr.employeeservice.service;

import ma.aui.erp.hr.employeeservice.model.Employee;
import ma.aui.erp.hr.employeeservice.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    // retrieve all employees
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    // retrieve an employee by id
    public Optional<Employee> getEmployee(Long id){
        return employeeRepository.findById(id);
    }

    // Add employee
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    // Update an employee by id
    public void updateEmployee(Employee employee, int id){
        if(id == employee.getEmployeeId()) {
            employeeRepository.save(employee);
        }
    }

    // delete all employees
    public void deleteAllEmployees(){
        employeeRepository.deleteAll();
    }

    // delete an employee by id
    public void deleteEmployeeByID(Long id){
        employeeRepository.deleteById(id);
    }

}


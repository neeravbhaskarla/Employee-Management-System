package emporg.employeeservice.controller;

import org.springframework.web.bind.annotation.RestController;

import emporg.employeeservice.constants.EmployeeConstants;
import emporg.employeeservice.dto.EmployeeDTO;
import emporg.employeeservice.service.EmployeeServiceImpl;
import emporg.employeeservice.support.ResponseMessage;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeService;

    // Create Operation
    @PostMapping
    public ResponseEntity<ResponseMessage> createEmployee(@RequestBody EmployeeDTO employeeDTO) {
        EmployeeDTO employeeId = employeeService.createEmployee(employeeDTO);
        return ResponseEntity.ok(new ResponseMessage(employeeId, EmployeeConstants.EMPLOYEE_CREATED));
    }

    // Read Operations
    @GetMapping("/{id}")
    public ResponseEntity<ResponseMessage> getEmployeeById(@PathVariable String id) {
        EmployeeDTO employee = employeeService.getEmployeeById(id);
        return ResponseEntity.ok(new ResponseMessage(employee, EmployeeConstants.EMPLOYEE_RETRIEVED));
    }

    @GetMapping("/email/{email}")
    public ResponseEntity<ResponseMessage> getEmployeeByEmail(@PathVariable String email) {
        EmployeeDTO employee = employeeService.getEmployeeByEmail(email);
        return ResponseEntity.ok(new ResponseMessage(employee, EmployeeConstants.EMPLOYEE_RETRIEVED));
    }

    @GetMapping
    public ResponseEntity<ResponseMessage> getAllEmployees(
            @RequestParam(required = false) Map<String, String> filters) {
        List<EmployeeDTO> employees = employeeService.getAllEmployees(filters);
        return ResponseEntity.ok(new ResponseMessage(employees, EmployeeConstants.EMPLOYEE_RETRIEVED));
    }

    // Update Operation
    @PutMapping
    public ResponseEntity<ResponseMessage> updateEmployee(@RequestBody EmployeeDTO employeeDTO) {
        EmployeeDTO updatedEmployee = employeeService.updateEmployee(employeeDTO);
        return ResponseEntity.ok(new ResponseMessage(updatedEmployee, EmployeeConstants.EMPLOYEE_UPDATED));
    }

    // Delete Operation
    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseMessage> deleteEmployee(@PathVariable String id) {
        EmployeeDTO employee = employeeService.deleteEmployee(id);
        return ResponseEntity.ok(new ResponseMessage(employee, EmployeeConstants.EMPLOYEE_DELETED));
    }

}

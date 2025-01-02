package emporg.employeeservice.service;

import java.util.List;
import java.util.Map;

import emporg.employeeservice.dto.EmployeeDTO;

public interface EmployeeService {
    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO);
    public EmployeeDTO getEmployeeById(String id);
    public EmployeeDTO getEmployeeByEmail(String email);
    public EmployeeDTO getEmployeeByPhoneNumber(String phoneNumber);
    public List<EmployeeDTO> getAllEmployees(Map<String, String> filters);
    public EmployeeDTO updateEmployee(EmployeeDTO employeeDTO);
    public EmployeeDTO deleteEmployee(String employeeId);
}

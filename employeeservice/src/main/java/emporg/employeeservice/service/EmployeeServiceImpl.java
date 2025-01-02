package emporg.employeeservice.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import emporg.employeeservice.dto.EmployeeDTO;
import emporg.employeeservice.exception.ResourceNotFoundException;
import emporg.employeeservice.exception.ResourceAlreadyExistsException;
import emporg.employeeservice.mappers.EmployeeMapper;
import emporg.employeeservice.model.Employee;
import emporg.employeeservice.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    
    @Override
    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {
        boolean emailExists = employeeRepository.findByEmail(employeeDTO.getEmail()).isPresent();
        if (emailExists) {
            throw new ResourceAlreadyExistsException("Employee", "email", employeeDTO.getEmail());
        }
        Employee employee = EmployeeMapper.toEmployee(employeeDTO);
        employeeRepository.save(employee);
        return EmployeeMapper.toEmployeeDTO(employee);
    }

    @Override
    public EmployeeDTO getEmployeeById(String id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        if (employee.isEmpty()) {
            throw new ResourceNotFoundException("Employee", "employeeId", id);
        }
        return EmployeeMapper.toEmployeeDTO(employee.get());
    }

    @Override
    public EmployeeDTO getEmployeeByEmail(String email) {
        Optional<Employee> employeeQuery = employeeRepository.findByEmail(email);
        if (employeeQuery.isPresent()) {
            Employee employee = employeeQuery.get();
            return EmployeeMapper.toEmployeeDTO(employee);
        }
        else{
            throw new ResourceNotFoundException("Employee", "email", email);
        }
    }

    @Override
    public EmployeeDTO getEmployeeByPhoneNumber(String phoneNumber) {
        Optional<Employee> employeeQuery = employeeRepository.findByPhoneNumber(phoneNumber);
        if (employeeQuery.isPresent()) {
            Employee employee = employeeQuery.get();
            return EmployeeMapper.toEmployeeDTO(employee);
        }
        else{
            throw new ResourceNotFoundException("Employee", "phoneNumber", phoneNumber);
        }
    }

    @Override
    public List<EmployeeDTO> getAllEmployees(Map<String, String> filters) {
        // TODO: implmement logic for filtering

        List<Employee> employees = employeeRepository.findAll();
        return employees.stream().map(employee -> EmployeeMapper.toEmployeeDTO(employee)).toList();
    }

    @Override
    public EmployeeDTO updateEmployee(EmployeeDTO employeeDTO) {
        Optional<Employee> employeeQuery = employeeRepository.findById(employeeDTO.getEmployeeId());
        if (employeeQuery.isPresent()) {
            Employee employee = employeeQuery.get();
            employee = EmployeeMapper.toEmployee(employeeDTO, employee);
            employeeRepository.save(employee);
            return EmployeeMapper.toEmployeeDTO(employee);
        }
        else{
            throw new ResourceNotFoundException("Employee", "employeeId", employeeDTO.getEmployeeId());
        }
    }

    @Override
    public EmployeeDTO deleteEmployee(String employeeId) {
        Optional<Employee> employeeQuery = employeeRepository.findById(employeeId);
        if (employeeQuery.isPresent()) {
            Employee employee = employeeQuery.get();
            employeeRepository.delete(employee);
            return EmployeeMapper.toEmployeeDTO(employee);
        }
        else{
            throw new ResourceNotFoundException("Employee", "employeeId", employeeId);
        }
    }
}

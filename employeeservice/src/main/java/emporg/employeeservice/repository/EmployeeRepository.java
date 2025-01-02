package emporg.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import emporg.employeeservice.model.Employee;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
    Optional<Employee> findByEmail(String email);
    Optional<Employee> findByPhoneNumber(String phoneNumber);
}

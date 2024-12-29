package emporg.employeeservice.dto;

import java.time.LocalDate;

import emporg.employeeservice.support.Department;
import emporg.employeeservice.support.Designation;
import lombok.Data;

@Data
public class EmployeeDTO {
    private Long employeeId;
    private String name;
    private String email;
    private String contact;
    private Department department;
    private String role;
    private Designation designation;
    private LocalDate joiningDate;
    private double salary;
    private boolean isActive;
}

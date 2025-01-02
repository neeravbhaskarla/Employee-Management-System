package emporg.employeeservice.dto;

import java.time.LocalDate;

import emporg.employeeservice.support.AccessControlProfile;
import emporg.employeeservice.support.Designation;
import lombok.Data;

@Data
public class EmployeeDTO {
    private Long employeeId;
    private String name;
    private String email;
    private String contact;
    private String departmentId;
    private String role;
    private Designation designation;
    private LocalDate joiningDate;
    private double salary;
    private boolean isActive;

    // Access Control
    private AccessControlProfile accessControlProfile;
}

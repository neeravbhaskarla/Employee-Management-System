package emporg.employeeservice.dto;

import java.time.LocalDate;

import emporg.employeeservice.support.AccessControlProfile;
import lombok.Data;

@Data
public class EmployeeDTO {
    private String employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String departmentId;
    private String role;
    private String designation;
    private LocalDate joiningDate;
    private double salary;
    private boolean isActive;

    // Access Control
    private AccessControlProfile accessControlProfile;

}

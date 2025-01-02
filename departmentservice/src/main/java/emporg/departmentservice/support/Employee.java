package emporg.departmentservice.support;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Employee {
    private String employeeId;
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

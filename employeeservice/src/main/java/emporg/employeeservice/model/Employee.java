package emporg.employeeservice.model;

import java.time.LocalDate;
import emporg.employeeservice.support.AccessControlProfile;
import emporg.employeeservice.support.Designation;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "employee")
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

package emporg.employeeservice.model;

import java.time.LocalDate;

import emporg.employeeservice.support.EmployeeIdGenerator;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
    @Id
    @EmployeeIdGenerator
    @Column(name = "employee_id", nullable = false, updatable = false)
    private String employeeId;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @Column(name = "department_id", nullable = false)
    private String departmentId;

    @Column(name = "role", nullable = false)
    private String role;

    @Column(name = "designation", nullable = false)
    private String designation;

    @Column(name = "joining_date", nullable = false)
    private LocalDate joiningDate;

    @Column(name = "salary", nullable = false)
    private double salary;

    @Column(name = "is_active", nullable = false)
    private boolean isActive;

    // Access Control
    @Column(name = "can_self_update", nullable = false)
    private boolean canSelfUpdate;

    @Column(name = "can_manager_edit", nullable = false)
    private boolean canManagerEdit;

    @Column(name = "can_hr_manage", nullable = false)
    private boolean canHRManage;
}

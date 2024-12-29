package emporg.employeeservice.model;

import java.time.LocalDate;
import java.util.List;

import emporg.employeeservice.support.AccessControlProfile;
import emporg.employeeservice.support.Department;
import emporg.employeeservice.support.Designation;
import emporg.employeeservice.support.EmergencyContact;
import emporg.employeeservice.support.PerformanceReview;
import emporg.employeeservice.support.ProjectHistory;
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
    private Department department;
    private String role;
    private Designation designation;
    private LocalDate joiningDate;
    private double salary;
    private boolean isActive;

    // Additional Profile Features
    private String profilePictureUrl;
    private List<String> certifications;
    private List<ProjectHistory> projectHistories;
    private List<PerformanceReview> performanceReviews;
    private List<EmergencyContact> emergencyContacts;

    // Access Control
    private AccessControlProfile accessControlProfile;
}

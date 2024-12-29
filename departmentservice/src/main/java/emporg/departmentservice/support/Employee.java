package emporg.departmentservice.support;

import java.time.LocalDate;
import java.util.List;

import emporg.departmentservice.model.Department;
import lombok.Data;

@Data
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

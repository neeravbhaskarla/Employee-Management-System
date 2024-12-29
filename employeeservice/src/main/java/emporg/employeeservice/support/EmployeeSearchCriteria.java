package emporg.employeeservice.support;

import java.time.LocalDate;

import lombok.Data;

@Data
public class EmployeeSearchCriteria {
    private String id;
    private String email;
    private String name;
    private Department department;
    private String role;
    private Boolean isActive;
    private Double minSalary;
    private Double maxSalary;
    private LocalDate joiningDate;
}

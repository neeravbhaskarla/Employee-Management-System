package emporg.employeeservice.support;

import java.time.LocalDate;

import lombok.Data;

@Data
public class ProjectHistory {
    private String projectId;
    private String projectName;
    private LocalDate startDate;
    private LocalDate endDate;
    private String role;
}

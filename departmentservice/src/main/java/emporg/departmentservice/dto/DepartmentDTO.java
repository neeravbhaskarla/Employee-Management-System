package emporg.departmentservice.dto;

import lombok.Data;

@Data
public class DepartmentDTO {
    private String departmentId;
    private String name;
    private String leader;
    private double budget;
    private String location;
}

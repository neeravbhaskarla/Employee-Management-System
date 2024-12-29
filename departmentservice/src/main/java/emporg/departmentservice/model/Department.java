package emporg.departmentservice.model;

import java.util.List;

import emporg.departmentservice.support.Employee;
import emporg.departmentservice.support.Team;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "department")
public class Department {
    private String departmentId;
    private String name;
    private Employee leader;
    private double budget;
    private String location;
    private List<Team> teams;
}

package emporg.employeeservice.support;

import java.util.List;

import emporg.employeeservice.model.Employee;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Department {
    private String departmentId;
    private String name;
    private Employee leader;
    private double budget;
    private String location;
    private List<Team> teams;
}

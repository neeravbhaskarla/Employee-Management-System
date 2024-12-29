package emporg.employeeservice.support;

import java.util.List;

import emporg.employeeservice.model.Employee;
import lombok.Data;

@Data
public class Team {
    private String teamId;
    private String name;
    private Employee leader;
    private List<String> members;
}

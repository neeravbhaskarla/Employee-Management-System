package emporg.departmentservice.support;

import java.util.List;

import lombok.Data;

@Data
public class Team {
    private String teamId;
    private String name;
    private Employee leader;
    private List<String> members;
}

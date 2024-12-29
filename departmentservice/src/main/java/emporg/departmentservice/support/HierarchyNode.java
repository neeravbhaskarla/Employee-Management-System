package emporg.departmentservice.support;

import java.util.List;

import lombok.Data;

@Data
public class HierarchyNode {
    private String id;
    private String name;
    private List<HierarchyNode> children;
}

package emporg.departmentservice.support;

import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class OrganizationHierarchy {
    private String departmentId;
    private Map<String, List<String>> roleRelationships;
    private List<HierarchyNode> hierarchyTree;
}

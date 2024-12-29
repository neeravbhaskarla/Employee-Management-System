package emporg.departmentservice.support;

import lombok.Data;

@Data
public class AccessControlProfile {
    private boolean canSelfUpdate;
    private boolean canManagerEdit;
    private boolean canHRManage;
}

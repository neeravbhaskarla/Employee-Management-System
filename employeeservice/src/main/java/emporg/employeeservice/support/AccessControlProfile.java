package emporg.employeeservice.support;

import lombok.Data;

@Data
public class AccessControlProfile {
    private boolean canSelfUpdate;
    private boolean canManagerEdit;
    private boolean canHRManage;
}

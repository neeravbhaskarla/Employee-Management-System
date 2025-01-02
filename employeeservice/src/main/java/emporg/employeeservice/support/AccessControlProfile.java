package emporg.employeeservice.support;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class AccessControlProfile {
    private boolean canSelfUpdate;
    private boolean canManagerEdit;
    private boolean canHRManage;
}

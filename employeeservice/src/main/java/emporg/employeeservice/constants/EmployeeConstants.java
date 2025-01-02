package emporg.employeeservice.constants;

import emporg.employeeservice.support.Designation;

public class EmployeeConstants {
    public static final String EMPLOYEE_NOT_FOUND = "Employee not found";
    public static final String EMPLOYEE_DELETED = "Employee deleted successfully";
    public static final String EMPLOYEE_UPDATED = "Employee updated successfully";
    public static final String EMPLOYEE_CREATED = "Employee created successfully";
    public static final String EMPLOYEE_RETRIEVED = "Employee retrieved successfully";
    public static final String EMPLOYEE_ALREADY_EXISTS = "Employee already exists";
    public static final String EMPLOYEE_DEACTIVATED = "Employee deactivated successfully";    
    public static final String EMPLOYEE_ACTIVATED = "Employee activated successfully";
    public static final String EMPLOYEE_DEACTIVATED_ALREADY = "Employee already deactivated";
    public static final String EMPLOYEE_ACTIVATED_ALREADY = "Employee already activated";
    public static final String INVALID_DESIGNATION = "Invalid designation should be one of the following: "+ Designation.values();
}

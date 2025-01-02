package emporg.employeeservice.mappers;

import emporg.employeeservice.dto.EmployeeDTO;
import emporg.employeeservice.model.Employee;
import emporg.employeeservice.support.AccessControlProfile;

public class EmployeeMapper {
    public static EmployeeDTO toEmployeeDTO(Employee employee) {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setEmployeeId(employee.getEmployeeId());
        employeeDTO.setFirstName(employee.getFirstName());
        employeeDTO.setLastName(employee.getLastName());
        employeeDTO.setEmail(employee.getEmail());
        employeeDTO.setPhoneNumber(employee.getPhoneNumber());
        employeeDTO.setDepartmentId(employee.getDepartmentId());
        employeeDTO.setRole(employee.getRole());
        employeeDTO.setDesignation(employee.getDesignation());
        employeeDTO.setJoiningDate(employee.getJoiningDate());
        employeeDTO.setSalary(employee.getSalary());
        employeeDTO.setActive(employee.isActive());
        employeeDTO.setAccessControlProfile(new AccessControlProfile(employee.isCanSelfUpdate(),
                employee.isCanManagerEdit(), employee.isCanHRManage()));

        return employeeDTO;
    }

    public static Employee toEmployee(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        employee.setEmployeeId(employeeDTO.getEmployeeId());
        employee.setFirstName(employeeDTO.getFirstName());
        employee.setLastName(employeeDTO.getLastName());
        employee.setEmail(employeeDTO.getEmail());
        employee.setPhoneNumber(employeeDTO.getPhoneNumber());
        employee.setDepartmentId(employeeDTO.getDepartmentId());
        employee.setRole(employeeDTO.getRole());
        employee.setDesignation(employeeDTO.getDesignation());
        employee.setJoiningDate(employeeDTO.getJoiningDate());
        employee.setSalary(employeeDTO.getSalary());
        employee.setActive(employeeDTO.isActive());
        employee.setCanSelfUpdate(employeeDTO.getAccessControlProfile().isCanSelfUpdate());
        employee.setCanManagerEdit(employeeDTO.getAccessControlProfile().isCanManagerEdit());
        employee.setCanHRManage(employeeDTO.getAccessControlProfile().isCanHRManage());
        return employee;
    }

    public static Employee toEmployee(EmployeeDTO employeeDTO, Employee employee) {
        employee.setEmployeeId(employeeDTO.getEmployeeId());
        employee.setFirstName(employeeDTO.getFirstName());
        employee.setLastName(employeeDTO.getLastName());
        employee.setEmail(employeeDTO.getEmail());
        employee.setPhoneNumber(employeeDTO.getPhoneNumber());
        employee.setDepartmentId(employeeDTO.getDepartmentId());
        employee.setRole(employeeDTO.getRole());
        employee.setDesignation(employeeDTO.getDesignation());
        employee.setJoiningDate(employeeDTO.getJoiningDate());
        employee.setSalary(employeeDTO.getSalary());
        employee.setActive(employeeDTO.isActive());
        employee.setCanSelfUpdate(employeeDTO.getAccessControlProfile().isCanSelfUpdate());
        employee.setCanManagerEdit(employeeDTO.getAccessControlProfile().isCanManagerEdit());
        employee.setCanHRManage(employeeDTO.getAccessControlProfile().isCanHRManage());

        return employee;
    }
}

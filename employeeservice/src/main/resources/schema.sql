CREATE TABLE if not exists Employee (
    employee_id VARCHAR(255) NOT NULL PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    phone_number VARCHAR(20) NOT NULL,
    department_id VARCHAR(255) NOT NULL,
    role VARCHAR(255) NOT NULL,
    designation VARCHAR(255) NOT NULL,
    joining_date DATE NOT NULL,
    salary DOUBLE NOT NULL,
    is_active BOOLEAN NOT NULL,
    can_self_update BOOLEAN NOT NULL,
    can_manager_edit BOOLEAN NOT NULL,
    can_hr_manage BOOLEAN NOT NULL
);
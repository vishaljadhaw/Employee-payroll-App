package com.spring.Employee_Payroll_App.exception;


import com.spring.Employee_Payroll_App.dto.EmployeePayrollDto;

public class EmployeePayrollNotFoundException extends RuntimeException {

    public EmployeePayrollNotFoundException(String name) {
        super("Unable to find employee payroll with name "+name);
    }

    public EmployeePayrollNotFoundException(Long id) {
        super("Unable to find employee payroll with id "+id);
    }

    public EmployeePayrollNotFoundException(EmployeePayrollDto employeePayrollDto) {
        super("Unable to find employee payroll with name "+employeePayrollDto.getName());
    }
}
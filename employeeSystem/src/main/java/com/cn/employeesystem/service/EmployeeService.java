package com.cn.employeesystem.service;

import com.cn.employeesystem.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> findAllEmployee();

//    Employee findEmployeeById(int id);
        Employee findEmployeeById(String id);
}

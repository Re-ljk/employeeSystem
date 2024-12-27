package com.cn.employeesystem.service.impl;
import com.cn.employeesystem.entity.Employee;
import com.cn.employeesystem.mapper.EmployeeMapper;
import com.cn.employeesystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> findAllEmployee() {
        List<Employee> list = employeeMapper.findAllEmployee();
        System.out.println(list);
        return list;
    }

    @Override
    public Employee findEmployeeById(String id) {
        return employeeMapper.findEmployeeById(id);
    }

}


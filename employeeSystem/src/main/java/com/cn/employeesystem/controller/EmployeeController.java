package com.cn.employeesystem.controller;

import com.cn.employeesystem.entity.Employee;
import com.cn.employeesystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Employee 控制器，用于处理与员工相关的 HTTP 请求
 */
@RestController

@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * 获取所有员工信息的接口
     *
     * @return 员工列表
     */
//    @GetMapping("/emps")
    @GetMapping
    public List<Employee> findAllEmp() {
        return employeeService.findAllEmployee();
    }
    @GetMapping("/findId/{id}")
    public Employee findEmployeeById(@PathVariable String id) {
        return employeeService.findEmployeeById(id);
    }

}

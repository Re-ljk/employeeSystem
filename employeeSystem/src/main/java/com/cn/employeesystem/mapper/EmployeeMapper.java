package com.cn.employeesystem.mapper;

import com.cn.employeesystem.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper

public interface EmployeeMapper {
    //查询所有员工信息
    public List<Employee> findAllEmployee();

}

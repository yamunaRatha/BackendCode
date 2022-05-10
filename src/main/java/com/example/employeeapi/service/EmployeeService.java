package com.example.employeeapi.service;

import com.example.employeeapi.model.Employee;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {


    List<Employee> getEmployees();

     Employee getEmployee(Integer empId);

     Employee addEmployee(Employee emp);

     Employee updateEmployee(Employee emp);

    String delEmployee(Integer empId);

}

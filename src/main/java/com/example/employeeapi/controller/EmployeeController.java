package com.example.employeeapi.controller;

import com.example.employeeapi.model.Employee;
import com.example.employeeapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    public EmployeeService eServ;

    @GetMapping("/getEmployees")
    public List<Employee> getEmployees()
    {
        return eServ.getEmployees();
    }

    @GetMapping("/getEmployee")
    public Employee getEmployee(@RequestParam Integer id)
    {
        return eServ.getEmployee(id);
    }

    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee emp)
    {
        return eServ.addEmployee(emp);
    }

    @PutMapping ("/updEmployee")
    public Employee updEmployee(@RequestParam Integer id, @RequestBody Employee newVal)
    {
        newVal.setId(id);
        return eServ.updateEmployee(newVal);
    }

    @DeleteMapping("/delEmployee")
    public String delEmployee(@RequestParam Integer id)
    {
        return eServ.delEmployee(id);
    }
}

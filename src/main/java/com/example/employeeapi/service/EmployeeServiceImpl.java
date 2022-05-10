package com.example.employeeapi.service;

import com.example.employeeapi.model.Employee;
import com.example.employeeapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository eRepo;

    @Override
    public List<Employee> getEmployees()
    {
        return eRepo.findAll();
    }
    @Override
    public Employee getEmployee(Integer empId)
    {
        Optional<Employee> emp = eRepo.findById(empId);
        if(emp.isPresent())
        {
            return emp.get();
        }
        return null;
    }

    @Override
    public Employee addEmployee(Employee emp)
    {
        return eRepo.save(emp);
    }

    @Override
    public Employee updateEmployee(Employee emp)
    {
        return eRepo.save(emp);
    }

    @Override
    public String delEmployee(Integer id) {
        if (!(id.toString().isEmpty())) {
            eRepo.deleteById(id);
            return "Record deleted successfully.";
        }
        return "Invalid Id, hence record not deleted.";
    }
}

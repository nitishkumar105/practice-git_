package com.example.webController;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
     public Employee addemployee(Employee e );
     List<Employee> getAll();
     Employee deleteEmployee(Employee e);
}

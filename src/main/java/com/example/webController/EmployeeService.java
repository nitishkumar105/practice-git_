package com.example.webController;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.webController.dto.EmployeeInfoDto;

@Service
public interface EmployeeService {
     public Employee addemployee(Employee e );
     List<EmployeeInfoDto> getAll();
     Employee deleteEmployee(Employee e);
     EmployeeInfoDto getByEmail(String email); // Method to find employee by email
}

package com.example.webController.Repository;

import com.example.webController.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDow extends JpaRepository<Employee, Long> {
      
}

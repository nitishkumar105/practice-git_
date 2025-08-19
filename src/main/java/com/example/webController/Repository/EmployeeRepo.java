package com.example.webController.Repository;

import com.example.webController.Employee;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
       Optional<Employee> findByEmail(String email); // Custom query to find employee by email
}

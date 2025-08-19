package com.example.webController;

import com.example.webController.Repository.EmployeeRepo;
import com.example.webController.dto.EmployeeInfoDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeUse implements EmployeeService {

    
    private EmployeeRepo empRepo;
    EmployeeUse(@Autowired EmployeeRepo empRepo) {
        this.empRepo = empRepo; 
     }  
     @Override
    public Employee addemployee(Employee e) {
        return empRepo.save(e);  // 💾 save to DB and return saved object
    }

    @Override
    public List<EmployeeInfoDto> getAll() {
        List<Employee> employees = empRepo.findAll(); // Fetch all employees from DB
        List<EmployeeInfoDto> employeeInfoDtos = new ArrayList<>();

        for (Employee employee : employees) {
            EmployeeInfoDto dto = new EmployeeInfoDto(
                employee.getName(),
                employee.getEmail(),
                employee.getAge()
            );
            employeeInfoDtos.add(dto);
        }
        return employeeInfoDtos; // Return list of DTOs
    }

    @Override
    public Employee deleteEmployee(Employee e) {
        empRepo.delete(e);         // ❌ delete from DB
        return e;
    }
     @Override
     public EmployeeInfoDto getByEmail(String email){
           Employee employeeOptional =empRepo.findByEmail(email).orElseThrow(()-> new RuntimeException("Employee not found with email: " + email));
            // Fetch employee by email, throw exception if not found
            // Convert Employee to EmployeeInfoDto
          return new EmployeeInfoDto(
                employeeOptional.getName(),
                employeeOptional.getEmail(),
                employeeOptional.getAge()
            ); // Return DTO with employee info
     }
}

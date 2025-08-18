package com.example.webController;

import com.example.webController.Repository.EmployeeDow;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeUse implements EmployeeService {

    
    private EmployeeDow empRepo;
    EmployeeUse( EmployeeDow empRepo) {
        this.empRepo = empRepo; 
     }  
     @Override
    public Employee addemployee(Employee e) {
        return empRepo.save(e);  // 💾 save to DB and return saved object
    }

    @Override
    public List<Employee> getAll() {
        List<Employee> list = new ArrayList<>();
        empRepo.findAll().forEach(list::add);  // convert Iterable to List
        return list;

    }

    @Override
    public Employee deleteEmployee(Employee e) {
        empRepo.delete(e);         // ❌ delete from DB
        return e;
    }
}

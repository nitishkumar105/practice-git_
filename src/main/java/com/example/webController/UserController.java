package com.example.webController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class UserController {

    @Autowired
    EmployeeService empUse;

    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
    Employee savedEmployee = empUse.addemployee(employee);
    return ResponseEntity.status(HttpStatus.CREATED).body(savedEmployee); // Sends 201 Created

   }

    @GetMapping("/all")
     public ResponseEntity<List<Employee>> getAllEmployee(){
        List<Employee>employees=empUse.getAll();
         return ResponseEntity.ok(employees);
     }
 
    public String test(){
        return "App is working";
    }
}

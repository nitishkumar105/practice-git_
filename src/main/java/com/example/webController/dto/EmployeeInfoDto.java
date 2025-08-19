package com.example.webController.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
 @NoArgsConstructor
 @Getter@Setter@AllArgsConstructor
public class EmployeeInfoDto {
     private String name;
     private String email;
     private int age;
}

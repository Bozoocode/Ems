package com.vamshi.controller;

import com.vamshi.model.Employee;
import com.vamshi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeRestcontroller {
    @Autowired
    EmployeeService empservice;
    @GetMapping("/allemploye")
    public List<Employee> myallemployee(){

        return	empservice.findallemployess();
    }
    @PostMapping("/api/employee")
    public Employee  savingemployee(@RequestBody Employee employee) {
        return empservice.saveemployee(employee);
    }
    @PutMapping("/api/updateemployee")
    public Employee  updating(@RequestBody Employee id) {
        return empservice.saveandBatchupdate(id);


    }
    @DeleteMapping("/employee/{id}")
    public void deletemethod(@PathVariable int id) {
        empservice.deleteemployee(id);
    }
}


package com.example.jajainterview.controller;


import com.example.jajainterview.exception.ResourceNotFoundException;
import com.example.jajainterview.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    /**
     * 1. Method should return all employees.
     */
    @GetMapping("/employees")
    public void getAllEmployees() {
    }

    /**
     * 1. Method should accept employee id as an argument (variable in the path).
     * 2. It should find an employee or throw ResourceNotFoundException.
     * 3. Return the employee in the body of the response entity.
     */
    @GetMapping("/employees/{id}")
    public void getEmployeeById()
            throws ResourceNotFoundException {
    }

    /**
     * 1. Method should accept employee object as an argument. Frontend will send the employee object in the request
     * body. The employee object should be validated.
     * 2. It should save the validated employee object in the database.
     * 3. Return the employee object.
     */
    @PostMapping("/employees")
    public void createEmployee() {
    }

    /**
     * 1. Method should accept employee id and employee details as arguments. The id is a variable in the endpoint
     * path. The details are send from the frontend through the request body. The employee details are of type Employee
     * mode and should be validated.
     * 2. It should find an employee or throw ResourceNotFoundException. It should update the found employee with the
     * details (from argument) and save the updated employee in the database.
     * 3. The method should return the updated employee object.
     */
    @PutMapping("/employees/{id}")
    public void updateEmployee() throws ResourceNotFoundException {
    }
}

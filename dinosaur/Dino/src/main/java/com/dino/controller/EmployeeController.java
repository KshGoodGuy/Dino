package com.dino.controller;

import com.dino.model.Department;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
    private final Department department;

    public EmployeeController(Department department) {
        this.department = department;
    }

    @GetMapping("/employees")
    public String showEmployees(Model model) {
        model.addAttribute("employees", department.getEmployees());
        return "employees"; // Thymeleaf 템플릿의 파일명 (employees.html)
    }
}

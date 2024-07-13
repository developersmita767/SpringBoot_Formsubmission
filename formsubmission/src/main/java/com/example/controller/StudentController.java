package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	@GetMapping("/register")
	public String showRegisterPage() {
		return"register";
		
	}
	@PostMapping("/create")
	public String register(@ModelAttribute Student student,Model model)
	{
		System.out.println(student);
		model.addAttribute("message","You have been registered successfully");
		return"register";
	}

}

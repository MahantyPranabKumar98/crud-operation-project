package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.student.entity.Student;
import com.student.services.StudentService;

@Controller
public class StudentController {
	@Autowired
	StudentService service;
	
	//create
	@PostMapping("/add")   // /check is the api end point
	public String addStudent(@ModelAttribute Student st) {
		System.out.println(" student data received from client");
		service.addStudent(st);
		return "index";
	}
	
	//read
	@GetMapping("/get")
	public String getStudent(@RequestParam("roll") int roll,Model model) {
	Student st	= service.getStudent(roll);
	model.addAttribute("student",st);
	//System.out.println(st);
	return "displayStudent";
	}
	
	//read all
	@GetMapping("/getAll")
	public String getAllStudent(Model model) {
     List<Student> sList = service.getAllStudent();
     model.addAttribute("sList", sList);
		return "displayAll";
	}
	
	//update
	@PostMapping("/update")
	public String updateStudent(@ModelAttribute Student st) {
	service.updateStudent(st);
	return "index";
	}
	
	//delete
	@PostMapping("/delete")
	public String deleteStudent(@RequestParam("roll")int roll,Model model) {
	service.deleteStudent(roll);
	model.addAttribute("roll", roll);
	return "index";		 
	}


}

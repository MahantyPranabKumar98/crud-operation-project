package com.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;







@Controller
public class NavController {
	@GetMapping("/addStudent")
	public String addStudent() {
		return "addStudent";
	}
	@GetMapping("/getStudent")
	public String getStudent() {
		return "getStudent";
	}
	@GetMapping("/updateStudent")
	public String updateStudent() {
		return "updateStudent";
	}
	@GetMapping("/deleteStudent")
	public String deleteStudent() {
		return "deleteStudent";
	}
	
	

}

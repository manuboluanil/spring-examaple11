package com.telusko.quizapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.quizapp.enities.Student;
import com.telusko.quizapp.service.StudentService;

@RestController

@RequestMapping("student")
public class StudentController {
	
	@Autowired
	StudentService studentService;

	@GetMapping("allstudents")
	public List <Student> getAllStudents() {

		return studentService.getAllStudents();
	}
}

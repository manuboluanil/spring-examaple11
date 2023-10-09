package com.telusko.quizapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.quizapp.dao.StudentDao;
import com.telusko.quizapp.enities.Student;

import jakarta.transaction.Transactional;

@Service
public class StudentService {
	
	@Autowired
	StudentDao studentDao;

	@Transactional
	public List<Student> getAllStudents(){
		
		return studentDao.findAll();
		
		
	}

	
}

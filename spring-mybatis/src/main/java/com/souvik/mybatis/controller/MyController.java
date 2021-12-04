package com.souvik.mybatis.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.souvik.mybatis.service.StudentService;

@RestController
public class MyController {
	
	@Autowired
	StudentService studentService;

	@GetMapping("/hello")
	public String hello() {
		return "Hello World";
	}
	
	@GetMapping("/students")
	public Object students() {
		return studentService.getAllStudents();
	}
}

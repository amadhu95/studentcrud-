package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.serviceinterface.Studentservice;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/API")
public class Studentcontroller {
	@Autowired
	private Studentservice studentservice;

	@GetMapping("/")
	public String homepage() {
		return "welcome to madhu";

	}

	@PostMapping("/add")
	public ResponseEntity<Student> addstudent(@RequestBody Student suri) {
		Student students = studentservice.createStudents(suri);
		return new ResponseEntity<Student>(students, HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Student> getStudent(@PathVariable Long id){
		return new ResponseEntity<Student>(studentservice.getStudent(id),HttpStatus.ACCEPTED); 
		
	}

}

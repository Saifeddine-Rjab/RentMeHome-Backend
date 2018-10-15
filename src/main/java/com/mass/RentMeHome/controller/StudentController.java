package com.mass.RentMeHome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mass.RentMeHome.model.Student;
import com.mass.RentMeHome.service.StudentService;

@RestController
@RequestMapping ("/api/students")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@RequestMapping(method = RequestMethod.GET, value = "")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();				
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public Student getStudent(@PathVariable int id) {
		return studentService.getStudentById(id);			
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "")
	public Student  addStudent(@RequestBody  Student student) {	
		return studentService.addStudent(student);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "")
	public Student  updateStudent(@RequestBody  Student student) {	
		return studentService.updateStudent(student);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public Student  deleteStudent(@PathVariable int id) {	
		return studentService.deleteStudent(id);
	}
}

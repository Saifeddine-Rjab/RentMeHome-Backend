package com.mass.RentMeHome.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mass.RentMeHome.dao.StudentDao;
import com.mass.RentMeHome.model.Student;

@Service
public class StudentService {

	@Autowired
	StudentDao studentDao;
	
	public List<Student> getAllStudents(){
		return studentDao.findAll();
	}
	
	
	public Student getStudentById(int id){
		return studentDao.findById(id).orElse(null);
	}
	
	
	
	public Student addStudent(Student student){
		return studentDao.save(student);
	}
	
	public Student updateStudent(Student student){
		return studentDao.save(student);
	}
	

	public Student deleteStudent(int id){
		
		//Vérification si le client existe:
		Student student;
		student=studentDao.findById(id).orElse(null);
		
		if(student==null) {
			return null;
		}
		else {
			studentDao.delete(student);
			return student;
		}
		
	}
	

}

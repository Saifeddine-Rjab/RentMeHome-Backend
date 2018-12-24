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
	
	
	public Student getStudentById(String id){
		return studentDao.findById(id).orElse(null);
	}
	
	
	
	public Student addStudent(Student student){
		
		//Vérification si l'étudiant existe:
		Student studentGot;
		studentGot=studentDao.findByEmail(student.getEmail());
		if(studentGot==null){
			return studentDao.save(student);
		}
		else {
			return null;			
		}
	}
	
	public Student updateStudent(Student student){
		return studentDao.save(student);
	}
	

	public Student deleteStudent(String id){
		
		//Vérification si l'étudiant existe:
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

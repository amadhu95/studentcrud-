package com.example.demo.serviceclass;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repositorys.Studentrepository;
import com.example.demo.serviceinterface.Studentservice;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@Service
@AllArgsConstructor
public class Studentserviceimpl implements Studentservice {
	
	@Autowired
	private  Studentrepository studentrepo;
	
	// repos
	@Override
	public Student createStudents(Student student) {
		return studentrepo.save(student);
		
	}

	@Override
	public List<Student> getAllStudents() {
	
		return studentrepo.findAll();
	
	}
	

	@Override
	public Student getStudent(Long id) {
		
		return studentrepo.getReferenceById(id);
	}

	@Override
	public Student updateStudent(Long id, Student student) { 
		if(studentrepo.existsById(id)) {
			student.setId(id);
		Student save = studentrepo.save(student);
		return save;
		
		}
		return null;
	}

	@Override
	public void deleteStudent(Long id) {
		
		
	}

}

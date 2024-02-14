package com.student.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.repository.StudentRepository;

@Service
public class StudentServiceImplementation implements StudentService {
	@Autowired
	StudentRepository repo;

	public void addStudent(Student st) {
		//add student to database
		repo.save(st);
		
		
	}

	public Student getStudent(int roll) {
		// TODO Auto-generated method stub
	Student st	= repo.findById(roll).get();
		return st;
	}
	

	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
    List<Student> sList = repo.findAll();
		return sList;
	}

	@Override
	public void updateStudent(Student st) {
		// TODO Auto-generated method stub
	repo.save(st);
		
	}

	@Override
	public void deleteStudent(int roll) {
		repo.deleteById(roll);
		
	}
	

}

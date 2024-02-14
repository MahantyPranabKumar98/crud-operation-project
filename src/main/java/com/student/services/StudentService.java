package com.student.services;

import java.util.List;

import com.student.entity.Student;

public interface StudentService {
	public void addStudent(Student st);

	public Student getStudent(int roll);

	public List<Student> getAllStudent();

	public void updateStudent(Student st);

	public void deleteStudent(int roll);

}

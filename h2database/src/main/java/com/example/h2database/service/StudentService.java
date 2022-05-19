package com.example.h2database.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.h2database.model.Student;
import com.example.h2database.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;

	public List<Student> getAllStudent() {
		List<Student> students = new ArrayList<>();
		studentRepository.findAll().forEach(student -> students.add(student));
		return students;
	}

	public Student getStudentById(int id) {
		
		return studentRepository.findById(id).get();
	}

	public void delete(int id) {
		
		studentRepository.deleteById(id);
	}

	public void saveOrUpdateStudent(Student student) {
		
		studentRepository.save(student);
	}

}

package com.example.demo.serviceI;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

public class StudentServiceImpl implements StudentServiceI{

	private static final Integer Id = null;
	@Autowired
	private StudentRepository studentRepository;
	
	
	@Override
	public int addStudent(Student student) {
Student save = studentRepository.save(student);
		
		return save.getStid();
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> findAll = studentRepository.findAll();
	
		return findAll;
	}

	@Override
	public Student getStudentById(int id) {

		Student findById = studentRepository.findById(id).get();
		return findById;
	}

}

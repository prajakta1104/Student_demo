package com;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController 
{
	@Autowired
	private IStudentService studentservice;
	@GetMapping(value="/student")
	List<Student>getStudentList()
	{
		List<Student> student =studentservice.listAll();
		return student;
	}
	
	@GetMapping(value="/student/{rno}")
	public Student getStudentDetails (@PathVariable("rno") int rno)
	{
		Student student =studentservice.getDetail(rno);
		return student;	
	}
	
	@PostMapping("/students")
	public Student CreateStudent(@RequestBody Student student)
	{
		return this.studentservice.addStudent(student);
	}
	
	@PutMapping("/students")
	public Student UpdateStudent(@RequestBody Student student)
	{
		return this.studentservice.UpdateStudent(student);
	}
	
	
	@DeleteMapping("/deletestudent/{rno}")
	public String deleteStudent(@PathVariable("rno") int rno)
	{
		return this.studentservice.DeleteStudent(rno);
		
	}
}

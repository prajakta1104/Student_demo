package com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.StudentDao.StudentDao;
import org.springframework.stereotype.Service;

//import spring.studentDao.StudentDao;

@Service
public class StudentService implements IStudentService
{
	@Autowired
	private StudentDao studentdao;
	
	StudentService()
	{
		
	}
	
	@Override
	public List<Student> listAll() 
	{
	
		return studentdao.findAll();
	}
	
	
	@Override
	public Student getDetail( int r) 
	{
		return studentdao.getOne(r);
	}

	@Override
	public Student addStudent(Student s) 
	{
		studentdao.save(s);
		return s;
	}

	@Override
	public String DeleteStudent(int r) 
	{
		Student entity=studentdao.getOne(r);
		studentdao.delete(entity);
		return "Student Deleted Sucessfully";
	}

	@Override
	public Student UpdateStudent(Student s) 
	{
		studentdao.save(s);
		return s;
	}

}

package com;

import java.util.ArrayList;
import java.util.List;

public interface IStudentService 
{
	List<Student> listAll();
	
	Student getDetail(int r);
	
	Student addStudent(Student s);
	
	String DeleteStudent(int r);
	
	Student UpdateStudent(Student s);
	
}

package com.StudentDao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Student;

public interface StudentDao extends JpaRepository<Student, Integer>
{

}

package com;

import java.util.ArrayList;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//import org.springframework.data.annotation.Id;
@Entity
public class Student
{

	
	 @Id
	Integer rno;
	 String name;
	int total;
	double percent;
	String status;
	   //@GeneratedValue(strategy = GenerationType.AUTO)
	    //@Column(name = "id")
	    //private Integer id;
	
	Student(int r,String n,int t,double p,String s)
	{
		rno=r;
		name= n;
		total=t;
		percent=p;
		status=s;
	}
	Student()
	{
		
	}
	public String getName() {
		return name;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getPercent() {
		return percent;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setPercent(double percent) {
		this.percent = percent;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	
	
	

}

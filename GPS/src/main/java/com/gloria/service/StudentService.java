package com.gloria.service;

import com.gloria.hibernate.Student;

public interface StudentService 
{
	public void registerStudent(Student student);
	
	public boolean authenticateStudent(Student student);
}
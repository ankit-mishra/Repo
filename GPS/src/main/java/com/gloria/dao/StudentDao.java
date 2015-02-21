package com.gloria.dao;

import com.gloria.hibernate.Student;

public interface StudentDao 
{
	public void registerStudent(Student student);
	
	public boolean authenticateStudent(Student student);

}

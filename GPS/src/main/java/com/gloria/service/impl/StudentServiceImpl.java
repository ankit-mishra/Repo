package com.gloria.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.gloria.dao.StudentDao;
import com.gloria.hibernate.Student;
import com.gloria.service.StudentService;

 
@Service
public class StudentServiceImpl implements StudentService 
{
	@Autowired
    private StudentDao studentDAO;
    
    @Transactional
    public void registerStudent(Student student) {
    	System.out.println("Student-->" + student.getFirstname());
    	studentDAO.registerStudent(student);
    }
    
    @Transactional
	public boolean authenticateStudent(Student student)
    {
    	boolean retStatus = false;
    	try
    	{
		System.out.println("Inside StudentServiceImpl");
    	retStatus = studentDAO.authenticateStudent(student);
    	}
    	catch(Exception ex)
    	{
    		ex.printStackTrace();
    	}
    	return retStatus;
    }

}

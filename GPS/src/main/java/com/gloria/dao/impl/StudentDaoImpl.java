package com.gloria.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.gloria.dao.StudentDao;
import com.gloria.hibernate.Student;

import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StudentDaoImpl implements StudentDao {
	private HibernateTemplate hibernateTemplate;

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	@Transactional(readOnly = false)
	public void registerStudent(Student student) {
		hibernateTemplate.save(student);

	}

	@Transactional(readOnly = false)
	public boolean authenticateStudent(Student student) {
		boolean isPassCorrect = false;

		SQLQuery query = hibernateTemplate.getSessionFactory().openSession()
				.createSQLQuery("select password from Student where userid=?");
		query.setParameter(0, student.getUserid());
		System.out.println("Inside StudentDaoImpl");
		List<Student> ls = (List<Student>) query.list();
		Iterator lt = ls.iterator();
		System.out.println("ID: ");
		for (int i = 0; i < ls.size(); i++) {
			System.out.println("ID: ");
			//Object[] qux = (Object[]) lt.next();
			String str = (String) lt.next();
			System.out.println("str-->>"+str);
			if (str.equals(student.getPassword())) {
				System.out.println("inside valid");
				isPassCorrect = true;
			}
			else {
				System.out.println("inside invalid");
				isPassCorrect = false;
			}

		}
		return isPassCorrect;
	}
}

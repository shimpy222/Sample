package com.pack.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pack.modal.Employee;
import com.pack.modal.Login;
import com.pack.modal.Question;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	SessionFactory sessionFactory;


	public void addEmpDao(Employee emp) {
		sessionFactory.getCurrentSession().save(emp);
		
	}


	
	@SuppressWarnings("unused")
	public List<Employee> fetchAllDao() {
		@SuppressWarnings("unchecked")
		List<Employee> l=sessionFactory.getCurrentSession().createQuery("from Employee").list();
		return l;
	}



	@Override
	public Employee getEmpDao(int id) {
		return (Employee)sessionFactory.getCurrentSession().get(Employee.class, id);
	}



	@Override
	public void updateEmpDao(Employee e) {
		Session s=sessionFactory.getCurrentSession();
		s.update(e);
	}



	@Override
	public void deleteEmpDao(Employee e) {
		Session s=sessionFactory.getCurrentSession();
		s.delete(e);
		
	}


//login work
	@Override
	public List<Login> fetchAllLoginDao() {
		@SuppressWarnings("unchecked")
		List<Login> lg=sessionFactory.getCurrentSession().createQuery("from Login").list();
		return lg;
	}



	@Override
	public List<Question> fetchAllQuestionDao() {
		@SuppressWarnings("unchecked")
		List<Question> lg=sessionFactory.getCurrentSession().createQuery("from Question").list();
		return lg;
	}
	
}

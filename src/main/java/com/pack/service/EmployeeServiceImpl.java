package com.pack.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.dao.EmployeeDao;
import com.pack.modal.Employee;
import com.pack.modal.Login;
import com.pack.modal.Question;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao empDao;

	
	public void addEmp(Employee emp) {
		empDao.addEmpDao(emp);
	}

	public List<Employee> fetchAll() {
		List<Employee> l=empDao.fetchAllDao();
		return l;
	}

	public Employee getEmp(int id) {
		return empDao.getEmpDao(id);
	}

	@Override
	public void updateEmp(Employee e) {
		empDao.updateEmpDao(e);
		
	}

	@Override
	public void deleteEmp(Employee e) {
		empDao.deleteEmpDao(e);
		
	}

	
	
	@Override
	public List<Login> fetchAllLogin() {
		List<Login> lg=empDao.fetchAllLoginDao();
		return lg;
		
	}

	@Override
	public List<Question> fetchAllQuestion() {
		List<Question> lgq=empDao.fetchAllQuestionDao();
		return lgq;
	}
	
	

}

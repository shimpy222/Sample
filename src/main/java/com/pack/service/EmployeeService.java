package com.pack.service;

import java.util.List;

import com.pack.modal.Employee;
import com.pack.modal.Login;
import com.pack.modal.Question;

public interface EmployeeService {

	public void addEmp(Employee emp);
	public List<Employee> fetchAll();
	public Employee getEmp(int id);
	public void updateEmp(Employee e);
	public void deleteEmp(Employee e);
	
	
	public List<Login> fetchAllLogin();
	public List<Question> fetchAllQuestion();
}

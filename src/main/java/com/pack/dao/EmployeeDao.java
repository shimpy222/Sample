package com.pack.dao;

import java.util.List;

import com.pack.modal.Employee;
import com.pack.modal.Login;
import com.pack.modal.Question;

public interface EmployeeDao {
   
	public void addEmpDao(Employee emp);
	public List<Employee> fetchAllDao();
	public Employee getEmpDao(int id);
	public void updateEmpDao(Employee e);
	public void deleteEmpDao(Employee e);
	
	public List<Login> fetchAllLoginDao();
	public List<Question> fetchAllQuestionDao();
}

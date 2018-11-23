package com.pack.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.XmlViewResolver;

import com.pack.modal.Employee;
import com.pack.modal.Login;
import com.pack.modal.Question;
import com.pack.service.EmployeeService;
import com.pack.validator.LoginValidator;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService empservice;
	@Autowired
	LoginValidator loginValidator;
	int page=0;public int counter=0;int end;
	
	@RequestMapping(value = "Login")
	public ModelAndView LoginEmployee(@ModelAttribute("login") Login login) throws IOException {
		return new ModelAndView("login");
	}
	
	@RequestMapping(value = "Question")
	public ModelAndView LoginEmployee(@ModelAttribute("question") Question ques) throws IOException {
		return new ModelAndView("addquestion");
	}
	
	//Login Part
	@RequestMapping(value="loginEmployee",method=RequestMethod.POST)
	public ModelAndView LoginValid(@ModelAttribute("login")@Valid Login login, BindingResult bindingresult) throws IOException{
		boolean flag=false;
		loginValidator.validate(login, bindingresult);
		if(bindingresult.hasErrors()){
			return new ModelAndView("login");}
			else{
				List<Login> list=empservice.fetchAllLogin();
				for(Login log : list){
					if((log.getName().equalsIgnoreCase(login.getName()))&& (log.getPass().equalsIgnoreCase(login.getPass()))){
						flag=true;
					}
					else{
						
					}
				}
				if(flag==true){
					return new ModelAndView("redirect:/successQuestion");
				}
				else{
					return new ModelAndView("login");
				}	
			}
	}
	
	@RequestMapping(value="pdf")
	public ModelAndView PdfGenerator(HttpServletRequest request,HttpSession session,Model model){
		List<Question> listQuestions=empservice.fetchAllQuestion(); 
		
		return new ModelAndView("UserSummary","listQuestions",listQuestions);
	}
	
	//fetching the questions and displaying it
	@RequestMapping(value="successQuestion")
	public ModelAndView showQuestion(){
		List<Question> Employee=empservice.fetchAllQuestion();
		List<Question> listEmployee=new ArrayList<Question>();
		for(int i=0;i<3;i++){
			listEmployee.add(Employee.get(i));
		}
		return new ModelAndView("success","listEmployee",listEmployee);
	}
	
	@RequestMapping(value="successQuestion2")
	public ModelAndView showQuestion2(){
		List<Question> listEmployee=empservice.fetchAllQuestion();
		List<Question> newlistEmployee=new ArrayList<Question>();
		for(int i=3;i<listEmployee.size();i++){
			newlistEmployee.add(listEmployee.get(i));
		}
		return new ModelAndView("success2","newlistEmployee",newlistEmployee);
	}
	
	@RequestMapping(value="ResultPage",method=RequestMethod.POST)
	public ModelAndView resultEmployee(HttpServletRequest request)
	{
		page++;
	
		int start=Integer.parseInt(request.getParameter("start"));
		end=Integer.parseInt(request.getParameter("end"));
		int total=end;
		System.out.println(start);
		System.out.println(end);
		for(int i=start;i<=end;i++){
			String option1=request.getParameter("option"+i);
			System.out.println("Answer marked is :"+option1);
		}
		List<Question> ls=empservice.fetchAllQuestion();
		int j=start-1;
		for(int i=start-1;i<end;i++){
			j++;
			String option1=request.getParameter("option"+j);
			System.out.println(option1);
			if(option1.equalsIgnoreCase(ls.get(i).getResult())){
				counter++;
			}
		}
		System.out.println(counter);
		Map<String,Integer> model=new HashMap<String,Integer>();
		model.put("counter", counter);
		model.put("end",end);
		if(page==1){
			return new ModelAndView("redirect:/successQuestion2");
		}else{
		return new ModelAndView("result","model",model);
	}}
	
	
	@RequestMapping(value = "saveEmployee" ,method=RequestMethod.POST)
	public ModelAndView saveEmployee(@ModelAttribute("employee")@Valid Employee employee, BindingResult bindingresult) throws IOException {
		if(bindingresult.hasErrors()){
		return new ModelAndView("EmployeeForm");}
		else{
			if(employee.getId()==0){
				empservice.addEmp(employee);
				List<Employee> li=empservice.fetchAll();
				return new ModelAndView("success","li",li);
			}
				//Employee e=empservice.getEmp(employee.getId());
				System.out.println("updatinngggg");
				empservice.updateEmp(employee);
				List<Employee> li=empservice.fetchAll();
				return new ModelAndView("success","li",li);
			
		}
	}
	
	@RequestMapping(value = "/editEmployee",method=RequestMethod.GET)
	public ModelAndView LoginEmployee(HttpServletRequest request){
		int id=Integer.parseInt(request.getParameter("id"));
		Employee emp=empservice.getEmp(id);
		ModelAndView model= new ModelAndView("EmployeeForm");
		model.addObject("employee",emp);
		return model;
	}
	
	
	
	@RequestMapping(value = "deleteEmployee" ,method=RequestMethod.GET)
	public ModelAndView deleteEmployee(HttpServletRequest request){
				
				int id=Integer.parseInt(request.getParameter("id"));
				Employee emp=empservice.getEmp(id);
				System.out.println("deleting");
				empservice.deleteEmp(emp);
				List<Employee> li=empservice.fetchAll();
				return new ModelAndView("success","li",li);
		
	}
	
}
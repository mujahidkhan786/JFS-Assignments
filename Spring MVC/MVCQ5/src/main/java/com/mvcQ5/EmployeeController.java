package com.mvcQ5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeDataBase EmployeeDBS;
	
	@RequestMapping(value = "/addEmployee",method = RequestMethod.GET)
	public ModelAndView addEmployee() {
		ModelAndView modelAndView = new ModelAndView("EmployeeForm");
		return modelAndView;
	}
	
	@RequestMapping(value ="/InsertEmployee",method =RequestMethod.POST)
	public ModelAndView updateEmployee(@ModelAttribute ("employee")Employee employee) throws Exception {
		EmployeeDBS.insertUser(employee);
		ModelAndView modelAndView = new ModelAndView("employeeDetail");

		return modelAndView;
	}
	@RequestMapping(value ="/employeeDetail")
	public ModelAndView emp() throws Exception {	
		ModelAndView modelAndView = new ModelAndView("employeeDetail");
		return modelAndView;
	}
	
	@RequestMapping("/deleteEmployee/{userId}")
	public ModelAndView deleteEmployee(@PathVariable ("userId") int userId)throws Exception {
		EmployeeDBS.deleteEmployee(userId);
		ModelAndView modelAndView = new ModelAndView("employeeDetail");
		modelAndView.addObject("msg",userId);
		return modelAndView;
	}
	
	@RequestMapping("/editEmployeeDetail/{userId}")
	public ModelAndView editEmployee(@PathVariable ("userId") int userId) {
		ModelAndView modelAndView = new ModelAndView("updateEmployee");
		modelAndView.addObject("userId",userId);
		return modelAndView;
	}
	
	@RequestMapping(value = "/updateEmployee",method = RequestMethod.POST)
	public ModelAndView updateDetails(@ModelAttribute ("employee")Employee employee) throws Exception {
		EmployeeDBS.updateDetails(employee);
		ModelAndView modelAndView = new ModelAndView("employeeDetail");
		modelAndView.addObject("msg",employee);
		return modelAndView;
	}
	

}
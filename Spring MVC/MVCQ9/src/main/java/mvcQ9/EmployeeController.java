package mvcQ9;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	@RequestMapping(value ="/employeeDetail.html")
	public ModelAndView emp() throws Exception {	
		ModelAndView modelAndView = new ModelAndView("employeeDetail");
		return modelAndView;
	}
}
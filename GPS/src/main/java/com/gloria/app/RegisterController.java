package com.gloria.app;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gloria.hibernate.Student;
import com.gloria.service.StudentService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class RegisterController {
	
	private static final Logger logger = LoggerFactory.getLogger(RegisterController.class);
	
	@Autowired
    private StudentService studentService;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView home(@ModelAttribute("student")Student student, BindingResult result) 
	{
		System.out.println("Inside RegisterController");
		System.out.println("Student-->" + student.getFirstname());
		if(student.getFirstname() != null)
		{
		studentService.registerStudent(student);
		}
		ModelAndView mav = new ModelAndView();
		mav.setViewName("register");
		/*(Locale locale, Model model) {
		logger.info("Welcome home! the client locale is "+ locale.toString());
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );		*/
		return mav;
	}
	
}
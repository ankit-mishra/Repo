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
public class SloginController {
	
	private static final Logger logger = LoggerFactory.getLogger(SloginController.class);
	
	@Autowired
    private StudentService studentService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 * 
	 * The request method should also be POST.
	 */
	@RequestMapping(value = "slogin", method = RequestMethod.GET)
	public ModelAndView home(@ModelAttribute("student")Student student, BindingResult result) 
	{
		//System.out.println("Inside SLoginController");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("slogin");
		//System.out.println("User Id ---> " + student.getUserid());
		
		if((student.getUserid() != null) && (!"".equals(student.getPassword())) && (!"".equals(student.getUserid())))
		{
			//System.out.println("Password ---> " + student.getPassword().length());
			//System.out.println("student.getPassword()--"+student.getPassword());
		boolean value = studentService.authenticateStudent(student);
		//System.out.println("value-->" + value);
		if(value)
		{
			mav.setViewName("student");
		}
		}
		/*(Locale locale, Model model) {
		logger.info("Welcome home! the client locale is "+ locale.toString());
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );		*/
		return mav;
	}
	
}
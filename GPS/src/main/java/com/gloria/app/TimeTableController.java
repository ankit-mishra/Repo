package com.gloria.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
public class TimeTableController {
	
	private static final Logger logger = LoggerFactory.getLogger(TimeTableController.class);
	
	@Autowired
    private StudentService studentService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 * 
	 * The request method should also be POST.
	 */
	@RequestMapping(value = "Mytimetable", method = RequestMethod.GET)
	public ModelAndView home(@ModelAttribute("student")Student student, BindingResult result) 
	{
		System.out.println("Inside TimeTableController");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("Mytimetable");
		System.out.println("User Id ---> " + student.getUserid());
		if(student.getUserid() != null)
		{
		boolean value = studentService.authenticateStudent(student);
		System.out.println("value-->" + value);
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
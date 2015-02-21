package com.gloria.test;

import org.junit.Test;
import org.junit.Assert;
import org.springframework.web.servlet.ModelAndView;

public class HomeControllerTest 
{
   @Test
   public void testHelloController() 
   {
       HomeController c = new HomeController();
       ModelAndView mav = c.handleRequest();
       Assert.assertEquals("hello", mav.getViewName());
   }
}

package com.javatpoint.autowiringannotations;  
  
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;  
  
public class Test {  
public static void main(String[] args) {  
    /*
     * Application Context Extends Bean Factory And Provides newer features like
     * event publishing , internationalization etc.
     */
    ApplicationContext context =   
    	    new ClassPathXmlApplicationContext("applicationContextOfficeEmployee.xml");
      
    AutoWiredOfficeEmployee e1 = (AutoWiredOfficeEmployee)context.getBean("officeEmployee1");
    e1.displayEmployee();
}  
}  
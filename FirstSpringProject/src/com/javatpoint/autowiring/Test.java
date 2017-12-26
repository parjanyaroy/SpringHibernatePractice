package com.javatpoint.autowiring;  
  
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;  
  
public class Test {  
public static void main(String[] args) {  
    /*
     * Application Context Extends Bean Factory And Provides newer features like
     * event publishing , internationalization etc.
     */
    ApplicationContext context =   
    	    new ClassPathXmlApplicationContext("applicationContextAutoWiring.xml");
      
    ParentClass e1 = (ParentClass)context.getBean("parentClass1");
    e1.displayInfo();
}  
}  
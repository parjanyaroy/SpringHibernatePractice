package com.javatpoint;  
  
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;  
  
public class Test {  
public static void main(String[] args) {  
    Resource resource=new ClassPathResource("applicationContext.xml");  
    BeanFactory factory=new XmlBeanFactory(resource);
    
    /*
     * Application Context Extends Bean Factory And Provides newer features like
     * event publishing , internationalization etc.
     */
    ApplicationContext context =   
    	    new ClassPathXmlApplicationContext("applicationContext.xml");
      
    Student student1=(Student)factory.getBean("studentbean");  
    Student student2=(Student)context.getBean("studentbean");
    student1.displayInfo();
    student2.displayInfo();
    
    Employee e1 = (Employee)context.getBean("employeeBean");
    System.out.println(e1.toString());
}  
}  
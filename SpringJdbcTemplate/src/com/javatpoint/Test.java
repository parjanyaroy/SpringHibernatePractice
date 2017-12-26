package com.javatpoint;  
  
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
public class Test {  
  
public static void main(String[] args) {  
    ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext1.xml");  
          
    EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");  
    dao.saveEmployeeByPreparedStatementMap((new Employee(110,"Parjanya",35000))); 
    
    
    dao.getAllEmployees().forEach((emp)->System.out.println(emp.getId()+" "
    						+emp.getName()+" "+emp.getSalary()));
    dao.getAllEmployeesRowMapper().forEach((emp)->System.out.println(emp.getId()+" "
			+emp.getName()+" "+emp.getSalary()));
}  
}  
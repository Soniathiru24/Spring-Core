package com.tnif.springcoreexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
     public static void main( String[] args )
    {
    	 
    	 //it is the IOC container
    	 //it reads and manages the beans
      ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
      College college =(College) context.getBean("collegeBean");
      college.show();
    
    
    }
}

package com.tnif.springcoreone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
   
	  ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
	  
	  Vechicle vechicle = (Vechicle)context.getBean("vechicleBean");
	  
	  vechicle.ride();
	  
  }
}

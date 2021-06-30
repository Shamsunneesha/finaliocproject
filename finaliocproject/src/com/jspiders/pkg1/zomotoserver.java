package com.jspiders.pkg1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class zomotoserver {

	public static void main(String[] args) 
	{
		ApplicationContext container=new ClassPathXmlApplicationContext("final.xml");
		User userObj=(User)container.getBean("sham123");
		System.out.println(userObj);
		

	}

}

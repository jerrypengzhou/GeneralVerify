package com.general.verified.web.spring.ioc.xml;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.general.verified.web.spring.ioc.annotation.Driver;

public class ZT_MainTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("CarContent.xml");
		Driver driver = (Driver) context.getBean("driver");
		try {
			System.out.println(driver.getClass().getMethods());
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		driver.Driving();
	}

}

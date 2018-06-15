package com.general.verified.web.spring.ioc.inject.constructor;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.general.verified.web.spring.ioc.inject.constructor.Driver;

public class ZT_SpringIocInjectConstructorTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/spring/com/general/verified/web/spring/ioc/inject/constructor/CarContent.xml");
		Driver driver = (Driver) context.getBean("driver");
		driver.Driving();
	}

}

package com.general.verified.web.spring.ioc.inject.setter;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.general.verified.web.spring.ioc.inject.setter.Driver;
/**
 * 测试spring set方法注入依赖
 * @author xujiali
 *
 */
public class zmain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/spring/com/general/verified/web/spring/ioc/inject/setter/CarContent.xml");
		Driver driver = (Driver) context.getBean("driver");
		driver.Driving();
	}

}

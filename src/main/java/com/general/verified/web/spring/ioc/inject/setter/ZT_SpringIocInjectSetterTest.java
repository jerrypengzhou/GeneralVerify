package com.general.verified.web.spring.ioc.inject.setter;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.general.verified.web.spring.ioc.inject.setter.Driver;
/**
 * ����spring set����ע��
 * @author xujiali
 *
 */
public class ZT_SpringIocInjectSetterTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/spring/com/general/verified/web/spring/ioc/inject/setter/CarContent.xml");
		Driver driver = (Driver) context.getBean("driver");
		driver.Driving();
	}

}

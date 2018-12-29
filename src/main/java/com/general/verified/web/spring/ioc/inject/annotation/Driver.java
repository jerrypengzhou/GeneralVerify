package com.general.verified.web.spring.ioc.inject.annotation;

import javax.annotation.Resource;
import org.springframework.stereotype.Component;

import com.general.verified.web.hibernate.models.Person;
/**
 * 测试spring自动注解注入依赖
 * @author xujiali
 *
 */
@Component
public class Driver extends Person{
	@Resource
	private Car benz;
	public void Driving() {
		benz.carHorn();
		benz.carRun();
	}
}

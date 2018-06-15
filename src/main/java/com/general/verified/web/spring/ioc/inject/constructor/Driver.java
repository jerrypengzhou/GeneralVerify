package com.general.verified.web.spring.ioc.inject.constructor;

import com.general.verified.web.hibernate.models.Person;

/**
 * 测试spring构造函数注入依赖
 * @author xujiali
 *
 */
public class Driver extends Person{
	
	private Car car;
	
	Driver(Car car) {
		this.car = car;
	}

	public void Driving() {
		car.carRun();
		car.carHorn();
	}
}

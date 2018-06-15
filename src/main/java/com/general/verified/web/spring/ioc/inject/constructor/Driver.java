package com.general.verified.web.spring.ioc.inject.constructor;
/**
 * 测试spring构造函数注入
 * @author xujiali
 *
 */
public class Driver {
	
	private Car car;
	private String name;
	private String age;
	private String phoneNum;

	Driver(Car car) {
		this.car = car;
	}

	public void Driving() {
		car.carRun();
		car.carHorn();
	}
}

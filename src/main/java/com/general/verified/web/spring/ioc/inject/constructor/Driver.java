package com.general.verified.web.spring.ioc.inject.constructor;
/**
 * ����spring���캯��ע��
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

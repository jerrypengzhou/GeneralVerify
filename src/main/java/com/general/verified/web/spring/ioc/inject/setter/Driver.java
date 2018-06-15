package com.general.verified.web.spring.ioc.inject.setter;

import com.general.verified.web.hibernate.models.Person;

/**
 * ����spring set����ע������
 * @author xujiali
 *
 */
public class Driver extends Person{
	
	private Car car;

	public void setCar(Car car) {
		this.car = car;
	}

	public void Driving() {
		car.carRun();
		car.carHorn();
	}
}

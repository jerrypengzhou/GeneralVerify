package com.general.verified.web.spring.ioc.inject.setter;

public class Driver {
	
	private Car car;

	public void setCar(Car car) {
		this.car = car;
	}

	public void Driving() {
		car.carRun();
		car.carHorn();
	}
}

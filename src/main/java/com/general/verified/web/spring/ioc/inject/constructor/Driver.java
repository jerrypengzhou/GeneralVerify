package com.general.verified.web.spring.ioc.inject.constructor;

public class Driver {
	
	private Car car;

	Driver(Car car) {
		this.car = car;
	}

	public void Driving() {
		car.carRun();
		car.carHorn();
	}
}

package com.general.verified.web.spring.ioc.inject.setter;
/**
 * ≤‚ ‘spring set∑Ω∑®◊¢»Î
 * @author xujiali
 *
 */
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

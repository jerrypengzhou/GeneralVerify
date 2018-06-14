package com.general.verified.web.spring.ioc.xml;

import org.springframework.stereotype.Component;

public class Benz implements Car {
	@Override
	public void carRun() {
		System.out.println("CarImpl running");

	}

	@Override
	public void carHorn() {
		System.out.println("CarImpl horning");

	}

}

package com.general.verified.web.spring.ioc.xml;

import org.springframework.stereotype.Component;

@Component
public class BMW implements Car {
	@Override
	public void carRun() {
		System.out.println("BMW4 running");

	}

	@Override
	public void carHorn() {
		System.out.println("BMW4 horning");

	}
}

package com.general.verified.web.spring.ioc.annotation;

import org.springframework.stereotype.Component;
import com.general.verified.web.spring.ioc.annotation.Benz;

@Component
public class BMW extends Benz {
	
	@Override
	public void carRun() {
		System.out.println("BMW4 running");

	}

	@Override
	public void carHorn() {
		System.out.println("BMW4 horning");

	}
}

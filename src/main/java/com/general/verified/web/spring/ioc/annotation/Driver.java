package com.general.verified.web.spring.ioc.annotation;

import javax.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class Driver {
	@Resource
	private Car benz;
	@Resource
	private Car bmw;
	
	public void Driving() {
		benz.carHorn();
		benz.carRun();
	}
}

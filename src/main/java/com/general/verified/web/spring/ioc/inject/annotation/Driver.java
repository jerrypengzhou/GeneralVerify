package com.general.verified.web.spring.ioc.inject.annotation;

import javax.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class Driver {
	@Resource
	private Car benz;
	public void Driving() {
		benz.carHorn();
		benz.carRun();
	}
}

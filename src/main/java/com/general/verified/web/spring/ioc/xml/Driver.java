package com.general.verified.web.spring.ioc.xml;

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

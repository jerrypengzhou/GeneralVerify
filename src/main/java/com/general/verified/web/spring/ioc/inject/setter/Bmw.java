package com.general.verified.web.spring.ioc.inject.setter;

import org.springframework.stereotype.Component;

@Component
public class Bmw implements Car {
	@Override
	public void carRun() {
		System.out.println("Bmw ����");

	}

	@Override
	public void carHorn() {
		System.out.println("Bmw �ڽ�");

	}
}

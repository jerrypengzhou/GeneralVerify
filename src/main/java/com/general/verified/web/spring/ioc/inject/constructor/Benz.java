package com.general.verified.web.spring.ioc.inject.constructor;

public class Benz implements Car {
	@Override
	public void carRun() {
		System.out.println("Benz ����");
	}

	@Override
	public void carHorn() {
		System.out.println("Benz �ڽ�");

	}

}

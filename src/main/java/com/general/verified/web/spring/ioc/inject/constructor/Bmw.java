package com.general.verified.web.spring.ioc.inject.constructor;

/**
 * ����spring���캯��ע������
 * @author xujiali
 *
 */
public class Bmw implements Car {
	@Override
	public void carRun() {
		System.out.println("Bmw running");

	}

	@Override
	public void carHorn() {
		System.out.println("Bmw horning");

	}
}

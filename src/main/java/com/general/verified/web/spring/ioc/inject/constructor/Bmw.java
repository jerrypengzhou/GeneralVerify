package com.general.verified.web.spring.ioc.inject.constructor;

/**
 * 测试spring构造函数注入依赖
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

package com.general.verified.web.spring.ioc.inject.constructor;
/**
 * 测试spring构造函数注入
 * @author xujiali
 *
 */
public class Benz implements Car {
	@Override
	public void carRun() {
		System.out.println("Benz 在跑");
	}

	@Override
	public void carHorn() {
		System.out.println("Benz 在叫");

	}

}

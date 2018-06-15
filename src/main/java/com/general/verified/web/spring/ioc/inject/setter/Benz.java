package com.general.verified.web.spring.ioc.inject.setter;
/**
 * 测试spring set方法注入
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

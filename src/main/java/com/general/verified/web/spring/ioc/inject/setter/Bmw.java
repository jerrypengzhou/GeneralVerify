package com.general.verified.web.spring.ioc.inject.setter;

/**
 * 测试spring set方法注入依赖
 * @author xujiali
 *
 */
public class Bmw implements Car {
	@Override
	public void carRun() {
		System.out.println("Bmw 在跑");

	}

	@Override
	public void carHorn() {
		System.out.println("Bmw 在叫");

	}
}

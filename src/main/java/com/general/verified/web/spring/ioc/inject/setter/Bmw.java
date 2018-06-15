package com.general.verified.web.spring.ioc.inject.setter;

import org.springframework.stereotype.Component;
/**
 * 测试spring set方法注入
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

package com.general.verified.web.spring.ioc.inject.annotation;

import org.springframework.stereotype.Component;
/**
 * 测试spring自动注解注入依赖
 * @author xujiali
 *
 */
@Component
public class Benz implements Car {
	@Override
	public void carRun() {
		System.out.println("CarImpl running");

	}

	@Override
	public void carHorn() {
		System.out.println("CarImpl horning");

	}

}

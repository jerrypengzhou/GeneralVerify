package com.general.verified.web.spring.ioc.inject.annotation;

import javax.annotation.Resource;
import org.springframework.stereotype.Component;
/**
 * 测试spring自动注解注入依赖
 * @author xujiali
 *
 */
@Component
public class Driver {
	@Resource
	private Car benz;
	public void Driving() {
		benz.carHorn();
		benz.carRun();
	}
}

package com.general.verified.web.spring.ioc.inject.annotation;

import org.springframework.stereotype.Component;
/**
 * ����spring�Զ�ע��ע������
 * @author xujiali
 *
 */
@Component
public class Bmw implements Car {
	@Override
	public void carRun() {
		System.out.println("BMW4 running");

	}

	@Override
	public void carHorn() {
		System.out.println("BMW4 horning");

	}
}

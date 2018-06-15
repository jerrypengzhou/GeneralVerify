package com.general.verified.web.spring.ioc.inject.annotation;

import javax.annotation.Resource;
import org.springframework.stereotype.Component;

import com.general.verified.web.hibernate.models.Person;
/**
 * ����spring�Զ�ע��ע������
 * @author xujiali
 *
 */
@Component
public class Driver extends Person{
	@Resource
	private Car benz;
	public void Driving() {
		benz.carHorn();
		benz.carRun();
	}
}

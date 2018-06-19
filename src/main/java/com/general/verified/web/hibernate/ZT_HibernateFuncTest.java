package com.general.verified.web.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.general.verified.web.hibernate.models.Model;
import com.general.verified.web.hibernate.models.Person;

public class ZT_HibernateFuncTest {

	public static void main(String[] args) {
		// 读取hibernate.cfg.xml的配置，加载hibernate的类库
		Configuration config = new Configuration().configure();
		// 根据配置，生成session工厂
		SessionFactory currentFactory = config.buildSessionFactory();
		// 用工厂生成session
		Session session = currentFactory.getCurrentSession();
		Transaction tran = session.beginTransaction();
		// 查询
		session.getTransaction();
		try {
//			session.saveOrUpdate(createPerson());
			Person p = session.get(Person.class, "23");
			tran.commit();
		} catch (Exception e) {
			tran.rollback();
		} finally {
			session.close();
			currentFactory.close();
		}

	}
	
	private static Model createPerson() {
		Person person = new Person();
		person.setAddress("龙泉驿区");
		person.setAge("23");
		person.setIdPerson("0123456789");
		person.setName("李强");
		person.setPhoneNumber("13678932312");
		person.setSex("男");
		return person;
	}
	
}

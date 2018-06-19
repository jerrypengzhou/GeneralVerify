package com.general.verified.web.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.general.verified.web.hibernate.models.Model;
import com.general.verified.web.hibernate.models.Person;

public class ZT_HibernateFuncTest {

	public static void main(String[] args) {
		// ��ȡhibernate.cfg.xml�����ã�����hibernate�����
		Configuration config = new Configuration().configure();
		// �������ã�����session����
		SessionFactory currentFactory = config.buildSessionFactory();
		// �ù�������session
		Session session = currentFactory.getCurrentSession();
		Transaction tran = session.beginTransaction();
		// ��ѯ
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
		person.setAddress("��Ȫ����");
		person.setAge("23");
		person.setIdPerson("0123456789");
		person.setName("��ǿ");
		person.setPhoneNumber("13678932312");
		person.setSex("��");
		return person;
	}
	
}

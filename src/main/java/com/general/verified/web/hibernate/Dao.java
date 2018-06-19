package com.general.verified.web.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.general.verified.web.hibernate.models.Model;

public class Dao implements IDao {
	private Session session;

	private Session getSession() {
		if(session == null) {
			// ��ȡhibernate.cfg.xml�����ã�����hibernate�����
			Configuration config = new Configuration().configure();
			// �������ã�����session����
			SessionFactory currentFactory = config.buildSessionFactory();
			// �ù�������session
			return currentFactory.getCurrentSession();
		}else {
			return session;
		}
	}
	@Override
	public Model selectById(String id,Model model) {
		return getSession().load(model.getClass(), id);
	}

	@Override
	public void deleteById(String id,Model model) {
		getSession().delete(model.getClass());
	}

	@Override
	public void excuteSql(String sql) {
		// TODO Auto-generated method stub
	}

	@Override
	public void updateModel(Model model) {
		// TODO Auto-generated method stub

	}

}

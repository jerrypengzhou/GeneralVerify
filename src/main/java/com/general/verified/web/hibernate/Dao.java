package com.general.verified.web.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.general.verified.web.hibernate.models.Model;

public class Dao implements IDao {
	private Session session;

	private Session getSession() {
		if(session == null) {
			// 读取hibernate.cfg.xml的配置，加载hibernate的类库
			Configuration config = new Configuration().configure();
			// 根据配置，生成session工厂
			SessionFactory currentFactory = config.buildSessionFactory();
			// 用工厂生成session
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
	}

	@Override
	public void updateModel(Model model) {
		// TODO Auto-generated method stub

	}

}

package com.general.verified.web.hibernate;

import com.general.verified.web.hibernate.models.Model;

public interface IDao {
	/**
	 * ��������id��ѯModel
	 * @param ����id
	 * @return ����ѯ��Model
	 */
	Model selectById(String id,Model model);
	/**
	 * ��������idɾ������
	 * @param id
	 */
	void deleteById(String id,Model model);
	/**
	 * ִ����Ӧsql
	 * @param sql
	 */
	void excuteSql(String sql);
	/**
	 * ������Ӧmodel
	 * @param model
	 */
	void updateModel(Model model);
}

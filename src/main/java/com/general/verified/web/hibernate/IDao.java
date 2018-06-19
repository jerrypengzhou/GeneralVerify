package com.general.verified.web.hibernate;

import com.general.verified.web.hibernate.models.Model;

public interface IDao {
	/**
	 * 根据主键id查询Model
	 * @param 主键id
	 * @return 被查询的Model
	 */
	Model selectById(String id,Model model);
	/**
	 * 根据主键id删除数据
	 * @param id
	 */
	void deleteById(String id,Model model);
	/**
	 * 执行相应sql
	 * @param sql
	 */
	void excuteSql(String sql);
	/**
	 * 更新相应model
	 * @param model
	 */
	void updateModel(Model model);
}

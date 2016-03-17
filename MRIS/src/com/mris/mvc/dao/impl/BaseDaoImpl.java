package com.mris.mvc.dao.impl;

import java.io.Serializable;
import java.sql.SQLException;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.mris.mvc.dao.BaseDao;
import com.mris.mvc.dao.BaseQuery;

public class BaseDaoImpl extends SqlSessionDaoSupport implements BaseDao{
	/***
	 * ����sqlMap��id��Ĭ��ֵ: _delete��ѯ�� _update�޸�; _save ���档
	 */
	public static final String SQLID_SAVE = "_save";
	public static final String SQLID_UPDATE = "_update";
	public static final String SQLID_DELETE = "_delete";

	// private static String MSG_SQL_LOGIC_ERROR = "SQL�߼��쳣";


	@Override
	public BaseQuery createQuery(String sqlName) {
		BaseQueryImpl query = new BaseQueryImpl(this.getSqlSession(),
				sqlName);
		return query;
	}

	@Resource
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	@Override
	public Serializable save(String sqlName, Object obj) {
		return (Serializable) this.getSqlSession().insert(
				sqlName, obj);
	}

	@Override
	public int update(String sqlName ,Object bean) throws SQLException {
		return update(sqlName, bean, true);
	}

	@Override
	public int update(String sqlName, Object bean, boolean lockedCheck) throws SQLException {
		int updateCount = this.getSqlSession().update(sqlName,
				bean);
		if (lockedCheck && updateCount == 0) {
			throw new SQLException("����ʧ��");
		} else if (lockedCheck && updateCount > 1) {
			throw new SQLException(bean.toString() + "��Ҫ�޸Ķ������ݡ�");
		}
		return updateCount;
	}

	@Override
	public int delete(String sqlName, Object bean) {
		if(bean == null){
			return this.getSqlSession().delete(sqlName);
		}else{
			return this.getSqlSession().delete(sqlName, bean);
		}
	}
}

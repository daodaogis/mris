package com.mris.mvc.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.mris.mvc.dao.BaseQuery;

public class BaseQueryImpl implements BaseQuery {

	protected String sqlName;
	protected Map<String, Object> paramMap = new HashMap<String, Object>();
	protected Object paramObj;
	private SqlSession sqlSession = null;
	
	public BaseQueryImpl() {

	}
	
	public BaseQueryImpl(SqlSession sqlSessionDaoSupport, String sqlName) {
		this.sqlSession = sqlSessionDaoSupport;
		this.sqlName = sqlName;
	}
	
	@Override
	public String getString() {
		// TODO Auto-generated method stub
		 return (String) sqlSession.selectOne(sqlName, getParameter());
	}

	@Override
	public <T>  List<T> getList() {
		return sqlSession.selectList(sqlName, getParameter());
	}

	@Override
	@SuppressWarnings("unchecked")
	public Map<String, Object> getMap() {
		return (Map<String, Object>) sqlSession.selectOne(sqlName,
				getParameter());
	}
	
	
	@Override
	public <T> T getObject() {
		return sqlSession.selectOne(sqlName,
				getParameter());
	}

	
	@Override
	public BaseQuery setParametrs(Map<String, Object> params) {
		if (params != null) {
			paramMap.putAll(params);
		}
		return this;
	}

	
	@Override
	public BaseQuery setParametr(String key, Object value) {
		if (key != null && !"".equals(key)) {
			paramMap.put(key, value);
		}
		return this;
	}

	@Override
	public BaseQuery setParametr(Object paramObj) {
		this.paramObj = paramObj;
		return this;
	}
	
	/**
	 * 获取参数
	 * 
	 * @return 如果对象参数不为空，就把对象参数返回，否则返回Map参数
	 */
	protected Object getParameter() {
		if (paramObj != null) {
			return paramObj;
		} else {
			return paramMap;
		}
	}
	
}

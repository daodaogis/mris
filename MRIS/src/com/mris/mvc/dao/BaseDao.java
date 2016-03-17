package com.mris.mvc.dao;

import java.io.Serializable;
import java.sql.SQLException;

public interface BaseDao {
	public BaseQuery createQuery(String sqlName);
	
	public Serializable save(String sqlName, Object obj);
	
	public int update(String sqlName ,Object bean) throws SQLException;
	
	public int update(String sqlName, Object bean, boolean lockedCheck) throws SQLException;
	
	public int delete(String sqlName, Object bean) ;
}

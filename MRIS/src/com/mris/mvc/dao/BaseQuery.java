package com.mris.mvc.dao;

import java.util.List;
import java.util.Map;

public interface BaseQuery {
	
	public String getString();
	
	public BaseQuery setParametrs(Map<String, Object> params);

	public BaseQuery setParametr(String key, Object value);

	public BaseQuery setParametr(Object paramObj);

	public Map<String, Object> getMap();

	public <T> List<T> getList();

	public <T> T getObject();
}

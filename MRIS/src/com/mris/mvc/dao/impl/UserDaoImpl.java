package com.mris.mvc.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.mris.bean.model.UserTB;
import com.mris.mvc.dao.UserDao;

@Repository
public class UserDaoImpl extends BaseDaoImpl implements UserDao{

	@Override
	public UserTB findUser(Map<String, String> map) {
		return getSqlSession().selectOne("Login.findUser", map);
	}
	
	@Override
	public List<UserTB> getUsers(Map<String, Object> map)
	{
		return getSqlSession().selectList("Login.getUsers", map);
	}

}

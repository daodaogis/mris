package com.mris.mvc.dao;

import java.util.List;
import java.util.Map;

import com.mris.bean.model.UserTB;

public interface UserDao{

	public UserTB findUser(Map<String, String> map);

	public List<UserTB> getUsers(Map<String, Object> map);
	
}
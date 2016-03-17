package com.mris.mvc.service;

import java.util.List;
import java.util.Map;

import com.mris.bean.model.UserTB;

public interface UserService {

	public UserTB findUser(Map<String, String> mapUserInfo);
	
	/**
	 * 
	 * @param map
	 * @return
	 */
	public List<UserTB> getUsers(Map<String, Object> map);
}

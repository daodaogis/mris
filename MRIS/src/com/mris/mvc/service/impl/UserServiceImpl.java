package com.mris.mvc.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mris.bean.model.UserTB;
import com.mris.mvc.dao.UserDao;
import com.mris.mvc.service.UserService;

@Service
public class UserServiceImpl  implements UserService{

	@Autowired  
	UserDao userDao;

	@Override
	public UserTB findUser(Map<String, String> mapUserInfo) {
		return userDao.findUser(mapUserInfo);
	}
	
	@Override
	public List<UserTB> getUsers(Map<String, Object> map)
	{
		return userDao.getUsers(map);
	}

}

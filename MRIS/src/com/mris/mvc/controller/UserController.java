package com.mris.mvc.controller;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mris.base.datasresource.DataSourceSwitch;
import com.mris.base.result.JsonResult;
import com.mris.bean.model.UserTB;
import com.mris.mvc.service.UserService;


@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    
    @ModelAttribute
   	public void init() {
   		DataSourceSwitch.clearDataSourceName();//setDataSourceName(DataSourceInstances.BUS);
   	}
   
    @RequestMapping("/list")
	@ResponseBody
	public String findUserList(HttpServletRequest request, Integer page, Integer rows, String sort, 
			String order, String name)
	throws ParseException{
		if(page == null || page == 0)
			page = 1;
		if(rows == null || rows == 0)
			rows = 10;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("page", page-1);
		map.put("rows", rows);
		if(sort != null && sort != "" && order != null && order != "")
		{
			map.put("sort", sort);
			map.put("order", order);
		}
		map.put("name", name);
		List<UserTB> list = userService.getUsers(map);
		Integer count = list.size();//exerciseManageService.findCount(map);
		JSONObject jobj = new JSONObject();
		jobj.accumulate("total", count);
		jobj.accumulate("rows", list);
		return JsonResult.getResult(1, jobj.toString());
	}
}
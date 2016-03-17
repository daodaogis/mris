package com.mris.bean.model;

/**
 * 用户信息表
 * @author djf 2016-1-15
 *
 */
public class UserTB {
	private  String type;//账户类型
	private  String name;//用户名
	private  String password;//密码
	private  String company;
	private String addr;
	private String phone;
	private String email;
	public String getType() {
		return type;
	}
	public void setType(String account) {
		this.type = account;
	}
	public String getUsername() {
		return name;
	}
	public void setUsername(String username) {
		this.name = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}

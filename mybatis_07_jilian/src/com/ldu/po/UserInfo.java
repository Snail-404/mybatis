package com.ldu.po;

import java.util.List;

public class UserInfo {
	private int id;
	private String userName;
	private String sex;
	private List<OrderInfo> Orderlist;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", userName=" + userName + ", sex=" + sex
				+ "]";
	}
	public List<OrderInfo> getOrderlist() {
		return Orderlist;
	}
	public void setOrderlist(List<OrderInfo> orderlist) {
		Orderlist = orderlist;
	}
	
	
	

}

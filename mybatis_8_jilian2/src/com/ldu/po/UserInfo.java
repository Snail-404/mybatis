package com.ldu.po;

import java.util.List;

public class UserInfo {
	private int userId;
	private String userName;
	private String userSex;
	private List<GroupInfo> groups;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public List<GroupInfo> getGroups() {
		return groups;
	}
	public void setGroups(List<GroupInfo> groups) {
		this.groups = groups;
	}
	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", userName=" + userName
				+ ", userSex=" + userSex + "]";
	}
	
}

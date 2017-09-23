package com.ldu.po;

import java.util.List;

public class GroupInfo {
	private int groupId;
	private String groupName;
	private List<UserInfo> users;
	
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public List<UserInfo> getUsers() {
		return users;
	}
	public void setUsers(List<UserInfo> users) {
		this.users = users;
	}
	@Override
	public String toString() {
		return "GroupInfo [groupId=" + groupId + ", groupName=" + groupName
				+ "]";
	}
}

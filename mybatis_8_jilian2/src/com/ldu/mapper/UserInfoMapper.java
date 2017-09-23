package com.ldu.mapper;

import java.util.List;

import com.ldu.po.UserInfo;

public interface UserInfoMapper {
	public UserInfo selectUsers(int userId);
	public List<UserInfo> selectUserByGroupId(int groupId);
}

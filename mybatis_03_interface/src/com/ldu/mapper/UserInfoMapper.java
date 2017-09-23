package com.ldu.mapper;

import java.util.List;

import com.ldu.po.UserInfo;

public interface UserInfoMapper {
	public List<UserInfo> selectUser(UserInfo user);
	public int insertUser(UserInfo user);
	public int updateUser(UserInfo user);
	public int deleteUser(int id);
}

package com.ldu.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.ldu.po.UserInfo;

public interface UserInfoMapper {
	public List<UserInfo> selectUser(UserInfo user);
	public int insertUser(@Param("name")String userName,@Param("sex")String sex);
	
	public int insertUser2(Map<String, Object> map);
	
	public int updateUser(UserInfo user);
	public int deleteUser(int id);
}

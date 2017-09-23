package com.ldu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.ldu.po.UserInfo;

public interface UserInfoMapper {
	
	@Select(value={"select * from user_info where user_id=#{id}"})
	@Results({@Result(property="id",column="user_id"),
		@Result(property="userName",column="user_name"),
		@Result(property="sex",column="user_sex")
	})
	public List<UserInfo> selectUser(UserInfo user);
	
	@Insert("insert into  user_info (user_name,user_sex) values(#{userName},#{sex})")
	public int insertUser(UserInfo user);
	
	@Update("update user_info set user_name=#{userName},user_sex=#{sex} where user_id = #{id}")
	public int updateUser(UserInfo user);
	
	@Delete("delete  from user_info where user_id=#{id}")
	public int deleteUser(int id);
}

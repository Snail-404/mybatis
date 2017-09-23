package com.ldu.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ldu.mapper.GroupInfoMapper;
import com.ldu.mapper.UserInfoMapper;
import com.ldu.po.GroupInfo;
import com.ldu.po.UserInfo;
import com.ldu.utils.DBFactory;

public class InfoTest {
	SqlSession session=null;
	UserInfoMapper userMapper=null;
	GroupInfoMapper groupMapper=null;
	
	@Before
	public void beforeTest(){
		session=DBFactory.getSqlSession();
		userMapper=session.getMapper(UserInfoMapper.class);
		groupMapper=session.getMapper(GroupInfoMapper.class);
	}
	
	@After
	public void afterTest(){
		session.close();
	}
	@Test
	public void getUser(){
		UserInfo user=userMapper.selectUsers(1);
		System.out.println(user);
		
		System.out.println(user.getGroups().size());
		for(GroupInfo ginfo:user.getGroups()){
			System.out.println(ginfo);
		}
		
	}
	
	@Test
	public void getGroup(){
		GroupInfo group=groupMapper.selectGroups(1);
		System.out.println(group);
		System.out.println(group.getUsers().size());
		for(UserInfo uinfo:group.getUsers()){
			System.out.println(uinfo);
		}
	}
	
}

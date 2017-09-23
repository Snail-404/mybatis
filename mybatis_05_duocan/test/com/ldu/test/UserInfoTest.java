package com.ldu.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ldu.mapper.UserInfoMapper;
import com.ldu.po.UserInfo;
import com.ldu.utils.DBFactory;

public class UserInfoTest {
	SqlSession session=null;
	UserInfoMapper mapper=null;
	
	@Before
	public void beforeTest(){
		session=DBFactory.getSqlSession();
		mapper=session.getMapper(UserInfoMapper.class);
	}
	
	@After
	public void afterTest(){
		session.close();
	}
	
	@Test
	public void selectList(){
		UserInfo fuser=new UserInfo();
		fuser.setId(7);
		List<UserInfo> list = mapper.selectUser(null);
		for(UserInfo u:list){
			System.out.println(u);
		}
	}
	
	@Test
	public void addUser(){	
		try {
			int count =mapper.insertUser("mj","男");
			if(count>0){
				session.commit();
				System.out.println("插入成功");
			}
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		}
	}
	
	@Test
	public void addUser2(){
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("userName", "mjjj");
		map.put("sex", "男");
		
		try {
			int count =mapper.insertUser2(map);
			if(count>0){
				session.commit();
				System.out.println("插入成功");
			}
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		}
	}
	
	@Test 
	public void updateUser(){
		UserInfo uuser=new UserInfo();
		uuser.setId(6);
		uuser.setUserName("叶天");
		uuser.setSex("男");
		
		try {
			int count=mapper.updateUser(uuser);
			if(count>0){
				session.commit();
				System.out.println("修改成功");
			}
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		}
	}
	
	@Test
	public void delUser(){
		int id=6;
		try {
			int count =mapper.deleteUser(id);
			if(count>0){
				session.commit();
				System.out.println("删除成功");
			}
		} catch (Exception e) {
			session.rollback();
			e.printStackTrace();
		}
	}
}

package com.ldu.test;

import java.util.List;

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
		UserInfo iuser=new UserInfo();
		iuser.setUserName("������");
		iuser.setSex("��");
		try {
			int count =mapper.insertUser(iuser);
			if(count>0){
				session.commit();
				System.out.println("����ɹ�");
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
		uuser.setUserName("Ҷ��");
		uuser.setSex("��");
		
		try {
			int count=mapper.updateUser(uuser);
			if(count>0){
				session.commit();
				System.out.println("�޸ĳɹ�");
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
				System.out.println("ɾ���ɹ�");
			}
		} catch (Exception e) {
			session.rollback();
			e.printStackTrace();
		}
	}
}

package com.ldu.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ldu.mapper.OrderInfoMapper;
import com.ldu.mapper.UserInfoMapper;
import com.ldu.po.OrderInfo;
import com.ldu.po.UserInfo;
import com.ldu.utils.DBFactory;

public class TestInfo {
	SqlSession session=null;
	UserInfoMapper mapper=null;
	OrderInfoMapper omapper=null;
	
	@Before
	public void beforeTest(){
		session=DBFactory.getSqlSession();
		mapper=session.getMapper(UserInfoMapper.class);
		omapper=session.getMapper(OrderInfoMapper.class);
	}
	
	@After
	public void afterTest(){
		session.close();
	}
	
	@Test
	public void seleceInfo(){
		List<OrderInfo> list=omapper.selectOrder();
		for(OrderInfo oinfo:list){
			System.out.println(oinfo);
			System.out.println(oinfo.getUserInfo());
		}
		
	}
	
	@Test
	public void selectUser(){
		UserInfo user=mapper.selectUser(3);
		System.out.println(user);
		for(OrderInfo oinfo:user.getOrderlist()){
			System.out.println(oinfo);
		}
	}
}

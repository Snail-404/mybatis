import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

import com.ldu.dao.UserDao;
import com.ldu.po.UserInfo;
import com.ldu.utils.DBFactory;

public class DBFactoryTest {
	UserDao userDao = null;

	@Before
	public void initUserDao() {
		userDao = new UserDao();
	}

	@Test
	public void select() {
		try {
			List<Object> list = userDao.selectUser("com.ldu.user.selectUser",
					null);
			for (Object o : list) {
				UserInfo user = (UserInfo) o;
				System.out.println(user);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	@Test
	public void selectOn() {
		try {
			
			UserInfo fuser = new UserInfo();
			//fuser.setId(2);
			List<Object> list = userDao.selectUser("com.ldu.user.selectOne",
					null);
			for (Object o : list) {
				UserInfo user = (UserInfo) o;
				System.out.println(user);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void insertUser() {
		UserInfo auser = new UserInfo();
		auser.setUserName("太宰");
		auser.setSex("男");

		int count = userDao.addUser("com.ldu.user.insertUser", auser);
		if (count > 0) {
			System.out.println("插入成功");
		} else {
			System.out.println("插入失败");
		}
	}

	@Test
	public void updateUser() {
		UserInfo uuser = new UserInfo();
		uuser.setId(3);
		uuser.setUserName("老虎");
		uuser.setSex("男");
		int count = userDao.updateUser("com.ldu.user.updateUser", uuser);
		if (count > 0)
			System.out.println("修改成功");
		else
			System.out.println("修改失败");
	}
	
	@Test
	public void deleteUser(){
		UserInfo duser=new UserInfo();
		duser.setId(1);
		int count =userDao.deleteUser("com.ldu.user.deleteUser", 2);
		if(count>0)
			System.out.println("删除成功");
		else 
			System.out.println("删除失败");
	}

}

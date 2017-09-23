import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.ldu.po.UserInfo;
import com.ldu.utils.DBFactory;


public class DBFactoryTest {
	@Test
	public void selectUser(){
		SqlSession sqlSession=null;
		try {
			sqlSession=DBFactory.getSqlSessionFactory().openSession();
			List<UserInfo> list=sqlSession.selectList("com.ldu.user.selectUser");
			if (list!=null && list.size()>0) {
				for (UserInfo info : list) {
					System.out.println(info);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if (sqlSession!=null) {
				sqlSession.close();
			}
		}
		
	}
	
	@Test
	public void selectOne(){
		SqlSession sqlSession=null;
		try {
			sqlSession=DBFactory.getSqlSessionFactory().openSession();
			UserInfo user=sqlSession.selectOne("com.ldu.user.selectOne",1);
			System.out.println(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if (sqlSession!=null) {
				sqlSession.close();
			}
		}
		
	}
}

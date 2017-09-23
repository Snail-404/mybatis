package com.ldu.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ldu.utils.DBFactory;

public class UserDao {
	/**
	 * 查询公共方法
	 * 
	 * @param sql
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	public List<Object> selectUser(String sql, Object obj) throws Exception {
		SqlSession session = DBFactory.getSqlSession();
		List<Object> list = session.selectList(sql, obj);
		session.close();
		return list;
	}

	/**
	 * 插入方法
	 * 
	 * @param sql
	 *            插入语句
	 * @param obj
	 *            冲入对象
	 * @return
	 */
	public int addUser(String sql, Object obj) {
		SqlSession session = null;

		try {
			session = DBFactory.getSqlSession();
			int count = session.insert(sql, obj);
			if (count > 0) {
				session.commit(); // 事务提交
			}
			return count;
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback(); // 回滚
		} finally {
			session.close();
		}
		return 0;
	}

	/**
	 * 修改数据
	 * 
	 * @param sql
	 * @param obj
	 * @return
	 */
	public int updateUser(String sql, Object obj) {
		SqlSession session = null;
		try {
			session = DBFactory.getSqlSession();
			int count = session.update(sql, obj);
			if (count > 0) {
				session.commit();
			}
			return count;
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			session.close();
		}
		return 0;
	}

	public int deleteUser(String sql, Object obj) {
		SqlSession session = null;
		try {
			session = DBFactory.getSqlSession();
			int count = session.delete(sql, obj);
			if (count > 0)
				session.commit();
			return count;
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			session.close();
		}
		return 0;
	}

}

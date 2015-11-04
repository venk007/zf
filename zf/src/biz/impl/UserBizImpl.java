package biz.impl;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import entity.Users;
import biz.UserBiz;

public class UserBizImpl implements UserBiz {

	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public int login(Users users) {
		
		Users u = userDao.getUserByName(users.getName());//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		if(u==null){
			return 2;
		}else if(!u.getPassword().equals(users.getPassword())){
			return 3;
		}
		
		return 1;
	}

	@Override
	public int zhuCe(Users users) {
		
		Users u = userDao.getUserByName(users.getName());
		if(u!=null){
			//账号存在于数据库，所以不可使用注册
			return 0;
		}
		
		userDao.addUser(users);
		return 1;
	}

}

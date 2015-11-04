package dao;

import entity.Users;

public interface UserDao {

	Users getUserByName(String name);

	void addUser(Users users);

}

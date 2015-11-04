package dao;

import java.util.List;

import entity.House;
import entity.Users;

public interface HouseDao {

	
	List fanYe(int dangQianYe);
	int getZongJiLu();
	void faBu(House house);
	House huoQuFangWu(long id);
	void delete(House house);
	List huoQuQuYu();
	List huoQuJieDao(long quId);
	List fanYe(int dangQianYe, House house, int price, int floorage);
	int getZongJiLu(House house, int price, int floorage);
	
}

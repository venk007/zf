package biz.impl;

import java.util.List;

import biz.HouseBiz;

import dao.HouseDao;
import dao.impl.HouseDaoImpl;
import entity.House;

public class HouseBizImpl implements HouseBiz{
	private HouseDao houseDao;
	
	public HouseDao getHouseDao() {
		return houseDao;
	}

	public void setHouseDao(HouseDao houseDao) {
		this.houseDao = houseDao;
	}

	public int getZongJiLu(){
		
		int res = houseDao.getZongJiLu();
		return res;
	}
	
	public List fanYe(int dangQianYe){
		
		List list = houseDao.fanYe(dangQianYe);
		return list;
	}

	
	public void faBu(House house) {
		//!!!!!!!!!!!!!!!!!!!!!!!
		houseDao.faBu(house);

	}
	
	public void delete(House house){
		
		houseDao.delete(house);
	}

	
	public House huoQuFangWu(long id) {
		
		
		
		return houseDao.huoQuFangWu(id);
	}

	public List huoQuQuYu() {
		
		return houseDao.huoQuQuYu();
	}
	
	public List huoQuJieDao(long quId){
		
		return houseDao.huoQuJieDao(quId);
	}

	
	public List fanYe(int dangQianYe, House house, int price, int floorage) {
		
		return houseDao.fanYe(dangQianYe,house,price,floorage);
		//上一步HouseBiz
		//HouseBizImpl
		//下一步HouseDao
		//HouseDaoImpl
	}

	
	public int getZongJiLu(House house, int price, int floorage) {
		
		return houseDao.getZongJiLu(house,price,floorage);
	}
	
}

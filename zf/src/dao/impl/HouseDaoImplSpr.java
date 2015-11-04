package dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateOperations;

import dao.HouseDao;
import entity.House;

public class HouseDaoImplSpr implements HouseDao{

	private HibernateOperations hibernateOperations;
	
	public List fanYe(int dangQianYe) {
	
		return null;
	}

	public int getZongJiLu() {
		
		return 0;
	}

	public void faBu(House house) {
		
		hibernateOperations.saveOrUpdate(house);
		
	}

	public House huoQuFangWu(final long id) {
		
		House house = (House)hibernateOperations.executeFind(new HibernateCallback(){
			
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
												
				Query query = session.createQuery("from House h left join fetch h.street s left join fetch s.district d where h.id=?");
				query.setLong(0, id);
				House h = (House) query.uniqueResult();
				return h;
			}
		});
		return house;
	}

	public void delete(House house) {
	Object obj = hibernateOperations.execute(new HibernateCallback(){
			
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query = session.createQuery("select count(id) from House");
				return query.uniqueResult();
			}
		});
			int res=Integer.parseInt(obj.toString());
			return res;
			
			/*
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		//É¾³ý
		session.delete(house);
		t.commit();
		session.close();
		sf.close();
			*/
	}

	@Override
	public List huoQuQuYu() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List huoQuJieDao(long quId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List fanYe(final int dangQianYe, House house, int price, int floorage) {
		
		Object obj = hibernateOperations.execute(new HibernateCallback(){
			
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query = session.createQuery("select count(id) from House");
				return query.uniqueResult();
			}
		});
		//!!!!!!!!!!!!!!!!!!!!!!!!!!
		List list = query.list();
		return list;			
	}
	
	
	public int getZongJiLu(House house,final int price, int floorage) {
		
		Object obj = hibernateOperations.execute(new HibernateCallback(){
			
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query = session.createQuery("select count(id) from House");
				return query.uniqueResult();
			}
		});
			int res=Integer.parseInt(obj.toString());
			return res;
	}
	
}


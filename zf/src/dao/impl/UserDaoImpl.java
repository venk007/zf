package dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

import dao.UserDao;
import entity.Users;

public class UserDaoImpl implements UserDao {

	public Users getUserByName(String name){
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();//!!!!!!!!!!!1
		Session session = sf.openSession();
		
		Query query = session.createQuery("from Users where name=?");
		query.setString(0, name);
		List list = query.list();
		session.close();
		sf.close();
		return list.isEmpty()?null:(Users)list.get(0);
	}

	public void addUser(Users users) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		session.save(users);
		t.commit();
		session.close();
		sf.close();
	}
}

package dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateOperations;

import dao.UserDao;
import entity.Users;

public class UserDaoImplSpr implements UserDao{

	private HibernateOperations hibernateOperations;
	
	
	public HibernateOperations getHibernateOperations() {
		return hibernateOperations;
	}

	public void setHibernateOperations(HibernateOperations hibernateOperations) {
		this.hibernateOperations = hibernateOperations;
	}

	@Override
	public Users getUserByName(final String name) {
		
		List list = hibernateOperations.executeFind(new HibernateCallback(){

			
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				
				Query query = session.createQuery("from Users where name=?");
				query.setString(0, name);
	
				return query.list();
			}
		});
		return list.isEmpty()?null:(Users)list.get(0);
	}

	@Override
	public void addUser(Users users) {
		
		hibernateOperations.saveOrUpdate(users);
		
		
	}


}

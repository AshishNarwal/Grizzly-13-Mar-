package com.cts.grizzly.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;

import com.cts.grizzly.bean.Login;


@Repository("loginDAO")
@org.springframework.transaction.annotation.Transactional(propagation= Propagation.SUPPORTS)
public class LoginDAOImpl implements LoginDAO{

	@Autowired
	SessionFactory sessionFactory;
	
	
	@org.springframework.transaction.annotation.Transactional(readOnly=true)
	public boolean authenticate(Login user) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String query = "from Login where userName=? and password =?";
		org.hibernate.query.Query<Login> query2 = session.createQuery(query);
		query2.setParameter(0, user.getUserName());
		query2.setParameter(1, user.getPassword());
		Login login = query2.getSingleResult();
		
		if(login==null) {
			return false;
			
		}
		else return true;
	}

}

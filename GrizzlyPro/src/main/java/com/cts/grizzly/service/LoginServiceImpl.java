package com.cts.grizzly.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cts.grizzly.bean.Login;
import com.cts.grizzly.dao.LoginDAO;

@Service("loginService")
@Transactional(propagation=Propagation.SUPPORTS)
public class LoginServiceImpl implements LoginService{
	@Autowired
	private LoginDAO loginDAO;

	public boolean authentication(Login user) {
		// TODO Auto-generated method stub
		return loginDAO.authenticate(user);
	}
	
	
}

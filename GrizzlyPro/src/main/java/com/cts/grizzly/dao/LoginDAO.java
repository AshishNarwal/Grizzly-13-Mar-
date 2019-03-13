package com.cts.grizzly.dao;

import com.cts.grizzly.bean.Login;

public interface LoginDAO {
	public boolean authenticate(Login user);
}

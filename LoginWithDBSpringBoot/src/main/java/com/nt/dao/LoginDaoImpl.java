package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
@Service
public class LoginDaoImpl implements LoginDao {
    @Autowired
	private JdbcTemplate jt;
	public int validateCredentials(String uname, String pwd) {
		int i=jt.queryForObject("select count(*) from employee where ename=? and sal=?",Integer.class,uname,pwd);
		return i;
	}

}

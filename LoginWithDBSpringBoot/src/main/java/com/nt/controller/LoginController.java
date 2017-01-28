package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.dao.LoginDao;

@Controller
public class LoginController {
    @Autowired
	private LoginDao dao;
	@RequestMapping("login")
	public String loginCheck(@RequestParam("uname") String uname,@RequestParam("pwd")String pwd){
    	int i=dao.validateCredentials(uname, pwd);
    	if(i==0){
    		return "failure";
    	}
    	else
    		return "success";
	}
}

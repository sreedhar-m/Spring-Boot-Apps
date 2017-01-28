package com.nt.controller;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
@ComponentScan("com.nt")
public class Application {

	@Bean
	public JdbcTemplate jt()
	{
		return (new JdbcTemplate(ds()));
	}

	private DriverManagerDataSource ds() {
		DriverManagerDataSource dms=new DriverManagerDataSource();
		dms.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dms.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		dms.setUsername("system");
		dms.setPassword("manager");
		return dms;

	}
	
	public static void main(String[] args){
		SpringApplication.run(Application.class, args);
	}
}

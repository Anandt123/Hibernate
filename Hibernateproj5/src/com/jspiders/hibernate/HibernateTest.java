package com.jspiders.hibernate;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jspiders.dto.Address;
import com.jspiders.dto.Vehicle;
import com.jspiders.dto.userDetails128;

public class HibernateTest {

	public static void main(String[] args) {
		
		userDetails128 user= new userDetails128();
		user.setUserName("vishal");
		user.setJoinedDate(new Date());
		user.setUserId(1234);
		
		Vehicle vehi = new Vehicle();
		vehi.setVehicleid(12);
		vehi.setVehiclename("TVS");
		user.setVehicle(vehi);
		
	//read the XML configuration file	
	SessionFactory sessionFactory=	new Configuration().configure("hibernate2.cfg.xml").buildSessionFactory();
	Session session=sessionFactory.openSession();
	session.beginTransaction();
	
	//it will write the query
	session.save(user);
	session.save(vehi);
	session.getTransaction().commit();	
	session.close();
	
	
}
}
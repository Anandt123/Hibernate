package com.jspiders.hibernate;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jspiders.dto.Address;
import com.jspiders.dto.userDetails128;

public class HibernateTest {

	public static void main(String[] args) {
		
		userDetails128 user= new userDetails128();
		user.setUserName("vishal");
		user.setJoinedDate(new Date());
		user.setUserId(1234);
		
		Address a1 = new Address();
		a1.setCity("Banglore");
		a1.setState("karnataka");
		a1.setPincode(560004);
		a1.setCountry("india");
		user.setHomeAddress(a1);
		
		Address a2 = new Address();
		
		a2.setCity("Bidar");
		a2.setState("karnataka");
		a2.setPincode(585401);
		a2.setCountry("uganda");
		user.setWorkAddress(a2);
		
		Address a3 =new Address();
		
		user.getListofAddress().add(a1);
		user.getListofAddress().add(a2);
		user.getListofAddress().add(a3);
		
		userDetails128 user1= new userDetails128();
		user1.setUserName("Anand");
		user1.setJoinedDate(new Date());
		user1.setUserId(1234);
		
		
		
	SessionFactory sessionFactory=	new Configuration().configure().buildSessionFactory();
	Session session=sessionFactory.openSession();
	session.beginTransaction();
	
	//it will write the query
	session.save(user);
	session.getTransaction().commit();	
	session.close();
	
	
	session=sessionFactory.openSession();
	userDetails128 user12 = (userDetails128)session.get(userDetails128.class, "vishal");
	
	System.out.println(user12);
	session.close();
	
}
}
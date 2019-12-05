package com.hibernatelearning.Firstdemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App {
	
	public static void main(String[] args) {

		Configuration conf = new Configuration().configure().addAnnotatedClass(student.class);

		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();
		SessionFactory factory = conf.buildSessionFactory(reg);
		Session session = factory.openSession();

		
		student student = new student();
		studentname sname=new studentname();
		
		sname.setFname("aniket");
		sname.setMname("vinodbhai");
		sname.setLname("Gajjar");
		
		  student.setStuid(104); 
		  student.setName(sname);
		  
		  Transaction tx = session.beginTransaction(); session.save(student);
		  
		  tx.commit();
		 
		/*
		 * Insert Record 
		 * 
		 * student student = new student();
		 * 
		 * student.setStuid(103); student.setFname("kalpana");
		 * student.setMname("Gajjar");
		 * 
		 * Transaction tx = session.beginTransaction(); session.save(student);
		 * 
		 * tx.commit();
		 */
		
		
		
		/*
		 * 
		 * Fetch Record 
		 * 
		 * student s = (com.hibernatelearning.Firstdemo.student)
		 * session.get(student.class, 101);
		 * 
		 * System.out.println(s);
		 */
		
		
		
	
	
	}
}

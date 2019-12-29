package com.hibernatelearning.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class App 
{
    public static void main( String[] args )
    {
        
        Configuration conf = new Configuration().configure();

		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();
		SessionFactory factory = conf.buildSessionFactory(reg);
		Session session = factory.openSession();

		Laptop laptop=new Laptop();
		laptop.setLid(1123);
		laptop.setName("hp");
		
		student  stu=new student();
		
		studentname name=new studentname();
		
		name.setFname("aniket");
		name.setLname("Gajjar");
		name.setMname("Vinodbhai");
		
		
		stu.setStuid(1139);
		stu.setName(name);
		stu.setLaptop(laptop);
		
		
		Transaction tx=session.beginTransaction();
		
		session.save(stu);
		session.save(laptop);
		
		tx.commit();
		
		
        
    }
}

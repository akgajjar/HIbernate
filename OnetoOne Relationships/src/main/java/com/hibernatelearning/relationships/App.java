package com.hibernatelearning.relationships;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        Configuration conf = new Configuration().configure().addAnnotatedClass(student.class).addAnnotatedClass(Laptop.class);

		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();
		SessionFactory factory = conf.buildSessionFactory(reg);
		Session session = factory.openSession();

		Laptop laptop=new Laptop();
		laptop.setLid(101);
		laptop.setName("hp");
		
		student  stu=new student();
		
		studentname name=new studentname();
		
		name.setFname("aniket");
		name.setLname("Gajjar");
		name.setMname("Vinodbhai");
		
		
		stu.setStuid(105);
		stu.setName(name);
		
		
		Transaction tx=session.beginTransaction();
		
		session.save(stu);
		session.save(laptop);
		
		tx.commit();
		
		
        
    }
}

package com.hibernatelearning.Caching_Level_1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
        
    	student s= null;
        Configuration conf = new Configuration().configure();

		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();
		SessionFactory factory = conf.buildSessionFactory(reg);
		Session session = factory.openSession();
		session.beginTransaction();
		
		
		/*
		 * studentname name = new studentname();
		 * 
		 * name.setFname("Harsh"); name.setMname("Vinodbhai"); name.setLname("Gajjar");
		 * 
		 * student s = new student(); s.setStuid(104); s.setName(name);
		 * 
		 * session.save(s);
		 * 
		 */
		
		
		 s = (student)session.get(student.class, 101);
		
		System.out.println(s);
		
       s = (student)session.get(student.class, 101);
		
		System.out.println(s);
		
		
		session.getTransaction().commit();
		session.close();
		
		
		Session session1 = factory.openSession();
		session1.beginTransaction();
		
	       s = (student)session1.get(student.class, 101);
			
			System.out.println(s);
		
		
		session1.getTransaction().commit();
		session1.close();
		
		
		
		
		
    }
}

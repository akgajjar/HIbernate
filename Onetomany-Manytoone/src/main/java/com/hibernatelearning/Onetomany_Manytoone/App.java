package com.hibernatelearning.Onetomany_Manytoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App {
	public static void main(String[] args) {
		Configuration conf = new Configuration().configure();

		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();
		SessionFactory factory = conf.buildSessionFactory(reg);
		Session session = factory.openSession();

		Laptop laptop = new Laptop();
		laptop.setLid(153);
		laptop.setName("hp");

		student stu = new student();

		studentname name = new studentname();

		name.setFname("aniket");
		name.setLname("Gajjar");
		name.setMname("Vinodbhai");

		stu.setStuid(119);
		stu.setName(name);
		stu.setLaptop(laptop);

		
		laptop.getStudents().add(stu);
		
		/*
		 * Transaction tx = session.beginTransaction();
		 * 
		 * session.save(stu); session.save(laptop);
		 * 
		 * tx.commit();
		 */

		Laptop lap = (com.hibernatelearning.Onetomany_Manytoone.Laptop) session.get(Laptop.class, 143);

		System.out.println(lap);

		/*
		 * System.out.println("Students : "); if (lap.getStudents() != null) { for
		 * (student s : lap.getStudents()) { System.out.println(s); } }
		 */
	}
}

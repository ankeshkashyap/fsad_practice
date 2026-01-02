package com.klu;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		
		Session session=factory.openSession();
		
		
		Transaction tx=session.beginTransaction();
		
		Student s=new Student("Ankesh");
		
		session.save(s);
		
		tx.commit();
		session.close();
	}

}

package com.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Setting the objects
        Student s = new Student();
        s.setStuid(1);
        s.setName("Geek");
        s.setAge(22);
        s.setStream("Computer science");
 
        // activate hibernate network
        Configuration cfg = new Configuration();
 
        // We use sessionfactory to build a session for
        // database and hibernate
        SessionFactory factory
            = cfg.configure("hibernate.cfg.xml")
                  .buildSessionFactory();
 
        // opening a session
        Session session = factory.openSession();
 
        // Transaction is a java object used to give the
        // instructions to database
        Transaction tx = session.beginTransaction();
 
        // we use save to provide the object to push in
        // database table
        session.save(s);
 
        // commit is a transaction function used to push
        // some changes to database with reference to hql
        // query
        tx.commit();
 
        session.close();
    
	}

}

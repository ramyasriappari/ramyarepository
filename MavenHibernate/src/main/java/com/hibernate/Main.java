package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
public static void main(String[] args) {
Configuration c = new Configuration();
c.configure("hibernate.xml");
SessionFactory sf= c.buildSessionFactory();

Session ob2=sf.openSession();
Transaction ob = ob2.beginTransaction();
Student ob3 = new Student();
ob3.setId(222);
ob3.setMarks(550);
ob3.setName("sowji");
ob2.save(ob3);
ob.commit();
ob2.close();
}



}


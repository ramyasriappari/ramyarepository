package com.motivity;
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
	CreditCard cc=new CreditCard();
	cc.setId(111);
	cc.setCcType("VISA");
	cc.setAmount(15000);
	Cheque cq=new Cheque();
	cq.setId(123);
	cq.setCqType("SBI");
	cq.setAmount(20000);
	ob2.save(cc);
	ob2.save(cq);
	ob.commit();
	ob2.close();
	}



	}




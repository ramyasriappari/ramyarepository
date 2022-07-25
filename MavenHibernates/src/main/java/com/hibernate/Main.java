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
Student st=new Student();    
st.setId(105);    
st.setMarks(700);    
st.setName("jabili");       
ob2.save(ob3);  
ob.commit();  
System.out.println("successfully saved");    
sf.close();  
ob2.close();
    
}
}


 



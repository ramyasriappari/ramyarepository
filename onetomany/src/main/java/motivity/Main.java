package motivity;
import java.util.ArrayList;

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
Student1 ans1=new Student1();    
ans1.setAnswername("Java is a programming language");    
ans1.setPostedBy("Nikhil ");    
    
Student1 ans2=new Student1();    
ans2.setAnswername("Java is a platform");    
ans2.setPostedBy("Josna");    
    
Student1 ans3=new Student1();    
ans3.setAnswername("Servlet is an Interface");    
ans3.setPostedBy("Ramya");    
    
Student1 ans4=new Student1();    
ans4.setAnswername("Servlet is an API");    
ans4.setPostedBy("Divya");    
    
ArrayList<Student1> list1=new ArrayList<Student1>();    
list1.add(ans1);    
list1.add(ans2);    
    
ArrayList<Student1> list2=new ArrayList<Student1>();    
list2.add(ans3);    
list2.add(ans4);    
    
Teacher question1=new Teacher();    
question1.setQname("What is Java?");    
question1.setAnswers(list1); 
    
Teacher question2=new Teacher();    
question2.setQname("What is Servlet?");    
question2.setAnswers(list2);    
    
ob2.persist(question1);    
ob2.persist(question2);    
    
ob.commit();    
ob2.close();    
System.out.println("success");    
}    
}
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
Answer an1=new Answer();  
an1.setAnswername("Java is a programming language");  
an1.setPostedBy("Nikhil");  
  
Answer an2=new Answer();  
an2.setAnswername("Java is a platform");  
an2.setPostedBy("Satya");  
 
Question q1=new Question();  
q1.setQname("What is Java?");  
ArrayList<Answer> l1=new ArrayList<Answer>();  
l1.add(an1);  
l1.add(an2);  
q1.setAnswers(l1);  
  
  
  Answer ans3=new Answer();    
    ans3.setAnswername("Servlet is an Interface");    
    ans3.setPostedBy("Josna");    
        
    Answer ans4=new Answer();    
    ans4.setAnswername("Servlet is an API");    
    ans4.setPostedBy("Ramya");    
  
Question q2=new Question();  
q2.setQname("What is Servlet?");  
ArrayList<Answer> l2=new ArrayList<Answer>();  
l2.add(ans3);  
l2.add(ans4);  
q2.setAnswers(l2);  
  
ob2.persist(q1);    
ob2.persist(q2);    
    
ob.commit();    
ob2.close();    
System.out.println("success");     
}    
}   

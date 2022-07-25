package motivity;
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
Employee e1=new Employee();    
e1.setName("Nikhil");    
e1.setEmail("nikhil@gmail.com");    
Employee e2=new Employee();  
e2.setName("josna");  
e2.setEmail("josna@gmail.com");  
    
Address address1=new Address();    
address1.setAddressLine1("Sriram nagar colony");    
address1.setCity("kondapur");    
address1.setState("telangana");    
address1.setCountry("India");    
address1.setPincode(201301);    
    
e1.setAddress(address1);    
e2.setAddress(address1);  

ob2.persist(e1);    
ob2.persist(e2);  
ob.commit();    
    
ob2.close();    
System.out.println("success");    
}    
}    

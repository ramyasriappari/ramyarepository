package com.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Hibernate5 {
    public static void main(String[] args) {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory factory = meta.getSessionFactoryBuilder().build();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        Student ab = new Student();
        ab.setId(5526);
        ab.setName("durga");
        ab.setMarks(550);

//      session.save(ab);
        session.update(ab);
        t.commit();
        System.out.println("successful ");
        factory.close();
        session.close();
    }
}



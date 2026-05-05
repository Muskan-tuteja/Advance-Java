package com.hibernat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "project started.." );
//        SessionFactory Factory = new Configuration().configure().buildSessionFactory();
    
    Configuration cfg = new Configuration();
    cfg.configure("hibernate.cfg.xml");
    SessionFactory factory = cfg.buildSessionFactory();
    System.out.println(factory);
    System.out.println(factory.isClosed());
//    creating student
    Student stu = new Student();
    stu.setId(120);
    stu.setName("MUSKAN");
    stu.setCity("HISSAR");
    System.out.println(stu);
    
//    Session session=factory.getCurrentSession();
    Session session=factory.openSession();
    
    Transaction tx = session.beginTransaction();
    session.save(stu);
    tx.commit();
    session.close();
    }
}

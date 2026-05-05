package imagehibernate;

import java.sql.Date;

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

    //created object of adress class
    Address ad = new Address();
    ad.setStreet("street1");
    ad.setCity("delhi");
    ad.setOpen(true);
    ad.setId(109);
    ad.setX(2.35);
    ad.setAddedDate(new Date(0));
    
    
    
    
    
    Session session=factory.openSession();
     Transaction tx = session.beginTransaction();
    session.save(ad);
    tx.commit();
    session.close();
    System.out.println("Done...");
    }
}


package pl.com.mycompany.javaproject.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Before;
import org.junit.Test;
import pl.com.mycompany.javaproject.model.Telephone;
import pl.com.mycompany.javaproject.util.HibernateUtil;


public class TelephoneTest {
    
    private Session session;
    
    @Before
    public void setUp() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.getCurrentSession();
    }
    
    @Test
    public void postPersist() {
        Transaction tx = session.beginTransaction();
        
        Telephone telephone = new Telephone();
        session.save(telephone);
        
        tx.commit();
    }
}

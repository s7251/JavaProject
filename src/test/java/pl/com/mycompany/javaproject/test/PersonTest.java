package pl.com.mycompany.javaproject.test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Before;
import org.junit.Test;

import pl.com.mycompany.javaproject.model.Person;
import pl.com.mycompany.javaproject.model.Telephone;
import pl.com.mycompany.javaproject.util.HibernateUtil;


public class PersonTest {
    
    private Session session;
    
    @Before
    public void setUp() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.getCurrentSession();
    }
    
    @Test
    public void commentPersist() {
        Transaction tx = session.beginTransaction();
        
        Telephone telephone = new Telephone("123123123");     
        Person person = new Person("Krystian", "Kulas", telephone);
        session.save(person);
        
        tx.commit();
    }
}

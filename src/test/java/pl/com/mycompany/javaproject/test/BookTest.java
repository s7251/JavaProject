package pl.com.mycompany.javaproject.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Before;
import org.junit.Test;
import pl.com.mycompany.javaproject.model.Book;
import pl.com.mycompany.javaproject.util.HibernateUtil;


public class BookTest {
    
    private Session session;
    
    @Before
    public void setUp() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.getCurrentSession();
    }

    @Test
    public void blogPersist() {
        Transaction tx = session.beginTransaction();

        Book b = new Book();
       
        
        session.save(b);

        tx.commit();
    }
}

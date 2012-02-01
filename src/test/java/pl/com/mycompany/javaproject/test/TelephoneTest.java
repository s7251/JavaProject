package pl.com.mycompany.javaproject.test;

import static org.junit.Assert.assertEquals;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Before;
import org.junit.Test;

import pl.com.mycompany.javaproject.model.Person;
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
        
        Telephone telephone = new Telephone("0700 :P");
        session.save(telephone);
        
        tx.commit();
    
    	}
    
    
    @Test
	public void testGetPerson() {
    	Telephone telephone = new Telephone("123");
    	telephone.setPerson(new Person("Borys", "Komorowski", telephone));
		assertEquals("Borys", telephone.getPerson().getFirstName());  
		assertEquals("Komorowski", telephone.getPerson().getSurname());
		}
    
    @Test
    public void testGetId() {
       	Telephone telephone = new Telephone ("123");
       	telephone.setId(1L);
   		assertEquals(new Long(1), telephone.getId());  
   		}
    
    public void testGetTelephone() {
       	Telephone telephone = new Telephone ("123");
       	telephone.setTelephone("123123123");
   		assertEquals("123123123", telephone.getTelephone());  
   		}
}

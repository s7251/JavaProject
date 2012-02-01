package pl.com.mycompany.javaproject.test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Before;
import org.junit.Test;

import pl.com.mycompany.javaproject.model.Book;
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
    public void personPersist() {
    	  Transaction tx = session.beginTransaction();
          
          Telephone telephone = new Telephone("123123123");     
          Person person = new Person("Krystian", "Kulas", telephone);
          session.save(person);
          
          tx.commit();
    }
    
    @Test
   	public void testPersonConstructor() {
    	Telephone telephone = new Telephone("123456789");
    	Person person = new Person("Borys", "Komorowski", telephone);
   		
    	assertEquals("Borys", person.getFirstName());  
   		assertEquals("Komorowski", person.getSurname());
   		assertSame(telephone, person.getTelephone());
   		
   		}
    
    @Test
   	public void testPersonSetters() {
    	Book book = new Book();
    	Telephone telephone = new Telephone("123456789");
    	Person person = new Person("Borys", "Komorowski", telephone);
   		person.setFirstName("Jan");
   		person.setSurname("Kowalski");
    	person.setBook(book);
    	person.setId(2L);
    	
   		assertSame(book, person.getBook());
    	assertEquals("Jan", person.getFirstName());  
   		assertEquals("Kowalski", person.getSurname());
   		assertEquals(new Long(2), person.getId());   		
   		}
    
    
}

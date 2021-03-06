package pl.com.mycompany.javaproject.test;

import static org.junit.Assert.*;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Before;
import org.junit.Test;

import pl.com.mycompany.javaproject.exception.TelephoneNumberException;
import pl.com.mycompany.javaproject.model.Book;
import pl.com.mycompany.javaproject.model.Person;
import pl.com.mycompany.javaproject.model.Telephone;
import pl.com.mycompany.javaproject.util.InitDataBase;

public class PersonTest {

    private Session session;

    @Before
    public void setUp() {
        InitDataBase initDataBase = new InitDataBase();
        session = initDataBase.init();
    }

    @Test
    public void personPersist() {
        Transaction tx = session.beginTransaction();

        Criteria criteria = session.createCriteria(Person.class);
        assertEquals(1, criteria.list().size());

        tx.commit();
    }

    @Test
    public void testPersonConstructor() throws TelephoneNumberException {
        Telephone telephone = new Telephone("123456789");
        Person person = new Person("Borys", "Komorowski", telephone);

        assertEquals("Borys", person.getFirstName());
        assertEquals("Komorowski", person.getSurname());
        assertSame(telephone, person.getTelephone());

    }

    @Test
    public void testPersonSetters() throws TelephoneNumberException {
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

package pl.com.mycompany.javaproject.test;

import static org.junit.Assert.*;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Before;
import org.junit.Test;

import pl.com.mycompany.javaproject.model.Person;
import pl.com.mycompany.javaproject.model.Telephone;
import pl.com.mycompany.javaproject.util.InitDataBase;

public class TelephoneTest {

	private Session session;

	@Before
	public void setUp() {
		InitDataBase initDataBase = new InitDataBase();
		session = initDataBase.init();
	}

	@Test
	public void telephonePersist() {
		Transaction tx = session.beginTransaction();

		Criteria criteria = session.createCriteria(Telephone.class);
		assertEquals(1, criteria.list().size());

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
		Telephone telephone = new Telephone("123");
		telephone.setId(1L);
		assertEquals(new Long(1), telephone.getId());
	}

	public void testGetTelephone() {
		Telephone telephone = new Telephone("123");
		telephone.setTelephone("123123123");
		assertEquals("123123123", telephone.getTelephone());
	}
}

package pl.com.mycompany.javaproject.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import pl.com.mycompany.javaproject.model.Book;
import pl.com.mycompany.javaproject.model.Person;
import pl.com.mycompany.javaproject.model.Telephone;

public class InitDataBase {

	public void init() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();

		Transaction tx = session.beginTransaction();
		
		Telephone telephone = new Telephone("123123123");
		Person person = new Person("Jan", "Kowalski", telephone);
		
		Book book = new Book();
		book.addPerson(person);
		
		session.save(book);
		session.save(person);
		
		tx.commit();

	};
}

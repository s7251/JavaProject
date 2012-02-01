package pl.com.mycompany.javaproject.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pl.com.mycompany.javaproject.model.Book;
import pl.com.mycompany.javaproject.model.Person;
import pl.com.mycompany.javaproject.model.Telephone;

public class InitDataBase {

	public Session init() {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

		Transaction tx = session.beginTransaction();
		
		Telephone telephone = new Telephone("123123123");
		Person person = new Person("Jan", "Kowalski", telephone);
		
		Book book = new Book();
		book.addPerson(person);
		
		session.save(book);
		session.save(person);
		
		tx.commit();
		
		return sessionFactory.getCurrentSession();

	};
}

package pl.com.mycompany.javaproject.util;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pl.com.mycompany.javaproject.exception.PersistedObjectIsNullException;
import pl.com.mycompany.javaproject.exception.TelephoneNumberException;
import pl.com.mycompany.javaproject.model.Book;
import pl.com.mycompany.javaproject.model.Person;
import pl.com.mycompany.javaproject.model.Telephone;

public class InitDataBase {

    public Session init() {
        SessionFactory sessionFactory = null;
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            Session session = sessionFactory.getCurrentSession();

            Transaction tx = session.beginTransaction();

            Telephone telephone = new Telephone("123123123");
            Person person = new Person("Jan", "Kowalski", telephone);

            Book book = new Book();
            book.addPerson(person);

            session.save(book);
            session.save(person);

            tx.commit();

        } catch (PersistedObjectIsNullException ex) {
            Logger.getLogger(InitDataBase.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TelephoneNumberException ex) {
            Logger.getLogger(InitDataBase.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return sessionFactory.getCurrentSession();
        }

    }
;
}

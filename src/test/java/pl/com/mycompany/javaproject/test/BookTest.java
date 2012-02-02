package pl.com.mycompany.javaproject.test;

import static org.junit.Assert.assertEquals;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Before;
import org.junit.Test;

import pl.com.mycompany.javaproject.model.Book;
import pl.com.mycompany.javaproject.util.InitDataBase;

public class BookTest {

    private Session session;

    @Before
    public void setUp() {
        InitDataBase initDataBase = new InitDataBase();
        session = initDataBase.init();
    }

    @Test
    public void bookPersist() {
        Transaction tx = session.beginTransaction();

        Criteria criteria = session.createCriteria(Book.class);
        assertEquals(1, criteria.list().size());

        tx.commit();
    }
}

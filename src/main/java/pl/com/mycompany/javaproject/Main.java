package pl.com.mycompany.javaproject;

import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import pl.com.mycompany.javaproject.exception.PersistedObjectIsNullException;
import pl.com.mycompany.javaproject.exception.TelephoneNumberException;
import pl.com.mycompany.javaproject.model.Book;
import pl.com.mycompany.javaproject.model.Person;
import pl.com.mycompany.javaproject.model.Telephone;
import pl.com.mycompany.javaproject.util.HibernateUtil;

public class Main {

    public static void main(String[] args) {
        try {
            Telephone telephone1 = new Telephone("0100200300");
            Person person1 = new Person("Jan", "Kowalski", telephone1);

            Telephone telephone2 = new Telephone("0200200200");
            Person person2 = new Person("Jan", "Kulas", telephone2);

            Telephone telephone3 = new Telephone("0300300300");
            Person person3 = new Person("Jan", "Janowski", telephone3);

            Telephone telephone4 = new Telephone("0400400400");
            Person person4 = new Person("Bronislaw", "Komorowski", telephone4);

            Telephone telephone5 = new Telephone("0500500500");
            Person person5 = new Person("Bronislaw", "Tusk", telephone5);

            Telephone telephone6 = new Telephone("0600600600");
            Person person6 = new Person("Borys", "Komorowski", telephone6);

            Book book = new Book();
            book.addPerson(person1);
            book.addPerson(person2);
            book.addPerson(person3);
            book.addPerson(person4);
            book.addPerson(person5);
            book.addPerson(person6);

            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.getCurrentSession();

            Transaction tx = session.beginTransaction();

            session.save(book);
            session.save(person1);
            session.save(person2);
            session.save(person3);
            session.save(person4);
            session.save(person5);
            session.save(person6);
            session.save(telephone1);
            session.save(telephone2);
            session.save(telephone3);
            session.save(telephone4);
            session.save(telephone5);
            session.save(telephone6);

            tx.commit();

            BookPrinter bookPrinter = new BookPrinter(book);

            System.out.println("--------------------------------------------------------");
            System.out.println("AFTER ADDING:");
            System.out.println("--------------------------------------------------------");

            bookPrinter.printNamesOfPersons();
            System.out.println("----------------------------");
            bookPrinter.printTelephonesOfPersons();
            System.out.println("----------------------------");
            bookPrinter.printPersons();

            System.out.println("--------------------------------------------------------");
            System.out.println("AFTER EDITING:");
            System.out.println("--------------------------------------------------------");

            person1.setFirstName("Mateusz");
            person1.setSurname("Podgorski");
            telephone1.setTelephone("0999888777");

            bookPrinter.printNamesOfPersons();
            System.out.println("----------------------------");
            bookPrinter.printTelephonesOfPersons();
            System.out.println("----------------------------");
            bookPrinter.printPersons();

            System.out.println("--------------------------------------------------------");
            System.out.println("AFTER REMOVING:");
            System.out.println("--------------------------------------------------------");

            book.removePerson(person1);
            bookPrinter.printNamesOfPersons();
            System.out.println("----------------------------");
            bookPrinter.printTelephonesOfPersons();
            System.out.println("----------------------------");
            bookPrinter.printPersons();

            System.out.println("--------------------------------------------------------");
            System.out.println("PERSONS BY FIRSTNAME:");
            System.out.println("--------------------------------------------------------");

            List<Person> personsData2 = book.searchPersonByFirstName(person4);
            Book newBookObject2 = new Book(personsData2);
            bookPrinter = new BookPrinter(newBookObject2);

            bookPrinter.printNamesOfPersons();
            System.out.println("----------------------------");
            bookPrinter.printTelephonesOfPersons();
            System.out.println("----------------------------");
            bookPrinter.printPersons();

            System.out.println("--------------------------------------------------------");
            System.out.println("PERSONS BY SURNAME:");
            System.out.println("--------------------------------------------------------");

            List<Person> personsData3 = book.searchPersonBySurname(person4);
            Book newBookObject3 = new Book(personsData3);
            bookPrinter = new BookPrinter(newBookObject3);

            bookPrinter.printNamesOfPersons();
            System.out.println("----------------------------");
            bookPrinter.printTelephonesOfPersons();
            System.out.println("----------------------------");
            bookPrinter.printPersons();
        } catch (PersistedObjectIsNullException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TelephoneNumberException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

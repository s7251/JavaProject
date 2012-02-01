package pl.com.mycompany.javaproject.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import pl.com.mycompany.javaproject.util.HibernateUtil;

@Entity
public class Book implements Serializable {

    private static final long serialVersionUID = -4604675661363004466L;
    private Long id;
    private List<Person> persons = new ArrayList<Person>();

    public Book() {
    }
	
    public Book(List<Person> persons) {
        this.persons = persons;
    }
	
    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToMany(mappedBy="book")
    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public void addPerson(Person person) {
        getPersons().add(person);
        person.setBook(this);
    }

    public void removePerson(Person person) {
        getPersons().remove(searchPerson(person));
    }
    
    @SuppressWarnings("unchecked")
    private List<Person> loadPersonsFormDB() {
    	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		
    	Transaction tx = session.beginTransaction();

		Criteria criteria = session.createCriteria(Person.class);
		List<Person> persons = criteria.list();

		tx.commit();
    	
    	return persons;
    }
    
    public Person searchPerson(Person person) {

        String firstname = person.getFirstName();
        String surname = person.getSurname();
        String telephone = person.getTelephone().getTelephone();

        for (Person sub : loadPersonsFormDB()) {
            if (firstname.equals(sub.getFirstName())
                    && surname.equals(sub.getSurname())
                    && telephone.equals(sub.getTelephone().getTelephone())) {
                return sub;
            }
        }
        return null;
    }

    public List<Person> searchPersonByFirstName(Person person) {

        List<Person> personData2 = new ArrayList<Person>();
        String firstname = person.getFirstName();

        for (Person sub : loadPersonsFormDB()) {
            if (firstname.equals(sub.getFirstName())) {
                personData2.add(sub);
            }

        }
        return personData2;
    }

    public List<Person> searchPersonBySurname(Person person) {

        List<Person> personData3 = new ArrayList<Person>();
        String surname = person.getSurname();

        for (Person sub : loadPersonsFormDB()) {
            if (surname.equals(sub.getSurname())) {
                personData3.add(sub);
            }

        }
        return personData3;
    }
}

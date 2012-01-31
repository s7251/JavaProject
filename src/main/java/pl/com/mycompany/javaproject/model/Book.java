package pl.com.mycompany.javaproject.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book implements Serializable {

	private static final long serialVersionUID = -4604675661363004466L;
	private Long id;
	private List<Person> personsData = new ArrayList<Person>();

	public Book() {	};
	
	public Book(List<Person> persons) {
		this.personsData = persons;
	};
	
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Person> getPersonsData() {
		return personsData;
	}
	
	public void addPerson(Person person) {
		getPersonsData().add(person);
	}

	public void removePerson(Person person) {
		getPersonsData().remove(searchPerson(person));
	}

	public Person searchPerson(Person person) {

		String firstname = person.getFirstName();
		String surname = person.getSurname();
		String telephone = person.getTelephone().getTelephone();

		for (Person sub : getPersonsData()) {
			if (firstname.equals(sub.getFirstName())
					&& surname.equals(sub.getSurname())
					&& telephone.equals(sub.getTelephone().getTelephone()))
				return sub;
		}
		return null;
	}

	public List<Person> searchPersonByFirstName(Person person) {

		List<Person> personData2 = new ArrayList<Person>();
		String firstname = person.getFirstName();

		for (Person sub : getPersonsData()) {
			if (firstname.equals(sub.getFirstName()))
				personData2.add(sub);

		}
		return personData2;
	}
	
	public List<Person> searchPersonBySurname(Person person) {

		List<Person> personData3 = new ArrayList<Person>();
		String surname = person.getSurname();

		for (Person sub : getPersonsData()) {
			if (surname.equals(sub.getSurname()))
				personData3.add(sub);

		}
		return personData3;
	}
	
}

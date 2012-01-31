package pl.com.mycompany.javaproject.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import pl.com.mycompany.javaproject.model.Telephone;

@Entity
public class Person implements Serializable {

	private static final long serialVersionUID = -1706043369714819652L;
	private String firstName;
	private String surname;
	private Telephone telephone;
	private Long id;
	
	public Person(String firstName, String surname, Telephone telephone) {
		this.firstName = firstName;
		this.surname = surname;
		this.telephone = telephone;
	}
    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Telephone getTelephone() {
		return telephone;
	}

	public void setTelephone(Telephone telephone) {
		this.telephone = telephone;
	}
}

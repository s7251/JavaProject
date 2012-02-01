package pl.com.mycompany.javaproject.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Person implements Serializable {

	private static final long serialVersionUID = -1706043369714819652L;
	private String firstName;
	private String surname;
	private Telephone telephone;
	private Long id;
	private Book book;
	
	protected Person() {}
	
	public Person(String firstName, String surname, Telephone telephone) {
		this.firstName = firstName;
		this.surname = surname;
		this.telephone = telephone;
		
		telephone.setPerson(this);
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

	@OneToOne(cascade=CascadeType.ALL)
	public Telephone getTelephone() {
		return telephone;
	}
	
	public void setTelephone(Telephone telephone) {
		this.telephone = telephone;
	}
	
	@ManyToOne
	@JoinColumn(name="book_fk")
	public Book getBook() {
		return book;
	}
	
	public void setBook(Book book) {
		this.book = book;
	}
}

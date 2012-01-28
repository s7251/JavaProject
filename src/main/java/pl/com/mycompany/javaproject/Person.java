package pl.com.mycompany.javaproject;
public class Person {

	private String firstName;
	private String surname;
	private Telephone telephone;

	public Person(String firstName, String surname, Telephone telephone) {
		this.firstName = firstName;
		this.surname = surname;
		this.telephone = telephone;
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

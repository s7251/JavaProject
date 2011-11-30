public class Name {
		
	private String firstname;
	private String surname;
	
	
	public Name(String firstname, String surname) {
		this.firstname = firstname;
		this.surname = surname;
	}
	
	public void printName()
	{
		System.out.println("Firstname: " +firstname+ " Surname: " +surname);
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
}
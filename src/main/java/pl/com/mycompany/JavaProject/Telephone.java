package pl.com.mycompany.JavaProject;
public class Telephone {

	private String telephone;

	public Telephone(String telephone) {
		this.telephone = telephone;
	}

	public void printTelephone() {
		System.out.println("Telephone: " + telephone);
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
}

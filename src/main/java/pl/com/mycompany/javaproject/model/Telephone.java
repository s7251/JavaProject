package pl.com.mycompany.javaproject.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Telephone implements Serializable {

	private static final long serialVersionUID = -5190018411839095157L;

	private Long id;
	private String telephone;

	public Telephone(String telephone) { 
		this.telephone = telephone;
	}

	public void printTelephone() {
		System.out.println("Telephone: " + telephone);
	}

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
}

import java.util.ArrayList;
import java.util.List;

public class Book {

	private List<Name> names = new ArrayList<Name>();
	private List<Telephone> telephones = new ArrayList<Telephone>();


	public void addName(String firstname, String surname) {
		names.add(new Name(firstname, surname));

	}

	public void addTelephone(String telephone) {
		telephones.add(new Telephone(telephone));

	}
	

	public void printNames() {

		System.out.println("Names:");
		for (Name name : names) {
			name.printName();
		}
	}

	public void printTelephones() {

		System.out.println("Telephones:");
		for (Telephone telephone : telephones) {
			telephone.printTelephone();
		}
	}
}

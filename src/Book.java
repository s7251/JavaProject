import java.util.ArrayList;
import java.util.List;


public class Book {

	private List<PersonData> persondata = new ArrayList<PersonData>();

	public void addPerson(PersonData person) {
		persondata.add(person);
	}

	public void removePerson(PersonData person) {
		persondata.remove(searchPerson(person));
	}

	public PersonData searchPerson(PersonData person) {
		
		String firstname = person.getFirstName();
		String surname = person.getSurname();
		String telephone = person.getTelephone().getTelephone();
		
		for (PersonData sub : persondata) {
			if (firstname.equals(sub.getFirstName()) && surname.equals(sub.getSurname()) && telephone.equals(sub.getTelephone().getTelephone()) )
				return sub;
		}
		return null;
	}

	public void printNamesOfPersons() {
		System.out.println("Names:");
		for (PersonData person : persondata) {
								
			System.out.println("firstname: " + person.getFirstName() + " surname: " + person.getSurname()) ;
		}
	}

	public void printTelephonesOfPersons() {
		System.out.println("Telephones:");
		for (PersonData person : persondata) {
			
			Telephone telephone = person.getTelephone();
			System.out.println(telephone.getTelephone());
		}
	}

	public void printPersons() {
		System.out.println("Persons:");
		for (PersonData person : persondata) {
			
			Telephone telephone = person.getTelephone();
			System.out.println(person.getFirstName() + " " + person.getSurname()
					+ " - " + telephone.getTelephone());
		}
	}
}

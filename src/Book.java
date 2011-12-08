import java.util.ArrayList;
import java.util.List;

public class Book {

        private List<PersonData> personsData = new ArrayList<PersonData>();
    
        public Book() {}
    
	public Book(List<PersonData> personsData){
            this.personsData = personsData;
	};
		
	public void addPerson(PersonData person) {
		getPersonsData().add(person);
	}

	public void removePerson(PersonData person) {
		getPersonsData().remove(searchPerson(person));
	}

	public PersonData searchPerson(PersonData person) {

		String firstname = person.getFirstName();
		String surname = person.getSurname();
		String telephone = person.getTelephone().getTelephone();

		for (PersonData sub : getPersonsData()) {
			if (firstname.equals(sub.getFirstName())
					&& surname.equals(sub.getSurname())
					&& telephone.equals(sub.getTelephone().getTelephone()))
				return sub;
		}
		return null;
	}

	
	public List<PersonData> searchPersonByFirstname(PersonData person){
		
		List<PersonData> personData2 = new ArrayList<PersonData>();
		String firstname = person.getFirstName();

		for (PersonData sub : getPersonsData()) {
			if (firstname.equals(sub.getFirstName()))
				personData2.add(sub);
				
		}
		return personData2;
	}

    public List<PersonData> getPersonsData() {
        return personsData;
    }
}

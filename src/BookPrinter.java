
import java.util.ArrayList;
import java.util.List;


public class BookPrinter {
    
    private Book book;
    
    public BookPrinter(Book book) {
        this.book = book;
    }
    
    public void printPersonsByFirstname() {
		for (PersonData person : book.getPersonsData()) {

			System.out.println("firstname: " + person.getFirstName()
					+ " surname: " + person.getSurname());
		}
	}
	
	public void printNamesOfPersons() {
		System.out.println("Names:");
		for (PersonData person : book.getPersonsData()) {

			System.out.println("firstname: " + person.getFirstName()
					+ " surname: " + person.getSurname());
		}
	}

	public void printTelephonesOfPersons() {
		System.out.println("Telephones:");
		for (PersonData person : book.getPersonsData()) {

			Telephone telephone = person.getTelephone();
			System.out.println(telephone.getTelephone());
		}
	}

	public void printPersons() {
		System.out.println("Persons:");
		for (PersonData person : book.getPersonsData()) {

			Telephone telephone = person.getTelephone();
			System.out.println(person.getFirstName() + " "
					+ person.getSurname() + " - " + telephone.getTelephone());
		}
	}
}

package pl.com.mycompany.javaproject;

import pl.com.mycompany.javaproject.model.Book;
import pl.com.mycompany.javaproject.model.Person;
import pl.com.mycompany.javaproject.model.Telephone;

public class BookPrinter {
    
    private Book book;
    
    public BookPrinter(Book book) {
        this.book = book;
    }
    
   	public void printNamesOfPersons() {
		System.out.println("Names:");
		for (Person person : book.getPersons()) {

			System.out.println("firstname: " + person.getFirstName()
					+ " surname: " + person.getSurname());
		}
	}

	public void printTelephonesOfPersons() {
		System.out.println("Telephones:");
		for (Person person : book.getPersons()) {

			Telephone telephone = person.getTelephone();
			System.out.println(telephone.getTelephone());
		}
	}

	public void printPersons() {
		System.out.println("Persons:");
		for (Person person : book.getPersons()) {

			Telephone telephone = person.getTelephone();
			System.out.println(person.getFirstName() + " "
				+ person.getSurname() + " - " + telephone.getTelephone());
		}
	}
	
	
}
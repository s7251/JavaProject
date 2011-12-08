import java.util.List;

public class Main {
	public static void main(String[] args) {

		
		Telephone telephone = new Telephone("0700700700");
		PersonData person = new PersonData("Jan", "Kowalski", telephone);
				
		Telephone telephone2 = new Telephone("0800800800");
		PersonData person2 = new PersonData("Jan", "Kulas", telephone2);

		Telephone telephone3 = new Telephone("0600600600");
		PersonData person3 = new PersonData("Jan", "Janowski", telephone3);
		
		Book book = new Book();
		book.addPerson(person);
		book.addPerson(person2);
		book.addPerson(person3);
                    
                BookPrinter bookPrinter = new BookPrinter(book);
                
		System.out.println("--------------------------------------------------------");
		System.out.println("AFTER ADDING:");
		System.out.println("--------------------------------------------------------");
		
		bookPrinter.printNamesOfPersons();
		System.out.println("----------------------------");
		bookPrinter.printTelephonesOfPersons();
		System.out.println("----------------------------");
		bookPrinter.printPersons();
		
		System.out.println("--------------------------------------------------------");
		System.out.println("AFTER EDITING:");
		System.out.println("--------------------------------------------------------");
		
		person.setFirstName("Mateusz");
		person.setSurname("Podgorski");
		telephone.setTelephone("0999888777");
		
		bookPrinter.printNamesOfPersons();
		System.out.println("----------------------------");
		bookPrinter.printTelephonesOfPersons();
		System.out.println("----------------------------");
		bookPrinter.printPersons();
		
		System.out.println("--------------------------------------------------------");
		System.out.println("AFTER REMOVING:");
		System.out.println("--------------------------------------------------------");
		
		
		book.removePerson(person);
		bookPrinter.printNamesOfPersons();
		System.out.println("----------------------------");
		bookPrinter.printTelephonesOfPersons();
		System.out.println("----------------------------");
		bookPrinter.printPersons();
		
		System.out.println("--------------------------------------------------------");
		System.out.println("PERSONS BY NAME:");
		System.out.println("--------------------------------------------------------");
		
                List<PersonData> personsData = book.searchPersonByFirstname(person3);
		Book newBookObject = new Book(personsData);

                bookPrinter.printPersons();

	}

}
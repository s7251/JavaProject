import java.util.List;

public class Main {
	public static void main(String[] args) {

		
		Telephone telephone1 = new Telephone("0100200300");
		PersonData person1 = new PersonData("Jan", "Kowalski", telephone1);
				
		Telephone telephone2 = new Telephone("0200200200");
		PersonData person2 = new PersonData("Jan", "Kulas", telephone2);

		Telephone telephone3 = new Telephone("0300300300");
		PersonData person3 = new PersonData("Jan", "Janowski", telephone3);
		
		Telephone telephone4 = new Telephone("0400400400");
		PersonData person4 = new PersonData("Bronislaw", "Komorowski", telephone4);
		
		Telephone telephone5 = new Telephone("0500500500");
		PersonData person5 = new PersonData("Bronislaw", "Tusk", telephone5);
		
		Telephone telephone6 = new Telephone("0600600600");
		PersonData person6 = new PersonData("Borys", "Komorowski", telephone6);
		
		Book book = new Book();
		book.addPerson(person1);
		book.addPerson(person2);
		book.addPerson(person3);
		book.addPerson(person4);
		book.addPerson(person5);
		book.addPerson(person6);

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
		
		person1.setFirstName("Mateusz");
		person1.setSurname("Podgorski");
		telephone1.setTelephone("0999888777");
		
		bookPrinter.printNamesOfPersons();
		System.out.println("----------------------------");
		bookPrinter.printTelephonesOfPersons();
		System.out.println("----------------------------");
		bookPrinter.printPersons();
		
		System.out.println("--------------------------------------------------------");
		System.out.println("AFTER REMOVING:");
		System.out.println("--------------------------------------------------------");
				
		book.removePerson(person1);
		bookPrinter.printNamesOfPersons();
		System.out.println("----------------------------");
		bookPrinter.printTelephonesOfPersons();
		System.out.println("----------------------------");
		bookPrinter.printPersons();
		
		System.out.println("--------------------------------------------------------");
		System.out.println("PERSONS BY FIRSTNAME:");
		System.out.println("--------------------------------------------------------");
		
		List<PersonData> personsData2 = book.searchPersonByFirstName(person4); 
		Book newBookObject2 = new Book(personsData2); 
		bookPrinter = new BookPrinter(newBookObject2); 
	
		bookPrinter.printNamesOfPersons();
		System.out.println("----------------------------");
		bookPrinter.printTelephonesOfPersons();
		System.out.println("----------------------------");
		bookPrinter.printPersons();
		
		System.out.println("--------------------------------------------------------");
		System.out.println("PERSONS BY SURNAME:");
		System.out.println("--------------------------------------------------------");
		
		List<PersonData> personsData3 = book.searchPersonBySurname(person4); 
		Book newBookObject3 = new Book(personsData3); 
		bookPrinter = new BookPrinter(newBookObject3); 

		bookPrinter.printNamesOfPersons();
		System.out.println("----------------------------");
		bookPrinter.printTelephonesOfPersons();
		System.out.println("----------------------------");
		bookPrinter.printPersons();
	}

}
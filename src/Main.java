public class Main {
	public static void main(String[] args) {

		
		Telephone telephone = new Telephone("0700700700");
		PersonData person = new PersonData("Jan", "Kowalski", telephone);
		
		
		Telephone telephone2 = new Telephone("0800800800");
		PersonData person2 = new PersonData("Krystian", "Kulas", telephone2);

		Book book = new Book();
		book.addPerson(person);
		book.addPerson(person2);

		System.out.println("--------------------------------------------------------");
		System.out.println("AFTER ADDING:");
		System.out.println("--------------------------------------------------------");
		
		book.printNamesOfPersons();
		System.out.println("----------------------------");
		book.printTelephonesOfPersons();
		System.out.println("----------------------------");
		book.printPersons();
		
		System.out.println("--------------------------------------------------------");
		System.out.println("AFTER EDITING:");
		System.out.println("--------------------------------------------------------");
		
		person.setFirstName("Mateusz");
		person.setSurname("Podgorski");
		telephone.setTelephone("0999888777");
		
		book.printNamesOfPersons();
		System.out.println("----------------------------");
		book.printTelephonesOfPersons();
		System.out.println("----------------------------");
		book.printPersons();
		
		System.out.println("--------------------------------------------------------");
		System.out.println("AFTER REMOVING:");
		System.out.println("--------------------------------------------------------");
		
		
		book.removePerson(person);
		book.printNamesOfPersons();
		System.out.println("----------------------------");
		book.printTelephonesOfPersons();
		System.out.println("----------------------------");
		book.printPersons();

	}

}
public class Main {
	public static void main(String[] args) {

		Name name = new Name("Krystian", "Kulas");
		Telephone telephone = new Telephone("0700700700");
		Subscriber subscriber = new Subscriber(name, telephone);

		Name name2 = new Name("Jan", "Kowalski");
		Telephone telephone2 = new Telephone("0400300200");
		Subscriber subscriber2 = new Subscriber(name2, telephone2);

		Book book = new Book();
		book.addSubscriber(subscriber);
		book.addSubscriber(subscriber2);

		System.out.println("--------------------------------------------------------");
		System.out.println("AFTER ADDING:");
		System.out.println("--------------------------------------------------------");
		
		book.printNames();
		System.out.println("----------------------------");
		book.printTelephones();
		System.out.println("----------------------------");
		book.printSubscriber();
		
		System.out.println("--------------------------------------------------------");
		System.out.println("AFTER EDITING:");
		System.out.println("--------------------------------------------------------");
		
		name.setFirstname("Mateusz");
		name.setSurname("Podgorski");
		telephone.setTelephone("0999888777");
		
		book.printNames();
		System.out.println("----------------------------");
		book.printTelephones();
		System.out.println("----------------------------");
		book.printSubscriber();
		
		System.out.println("--------------------------------------------------------");
		System.out.println("AFTER REMOVING:");
		System.out.println("--------------------------------------------------------");
		
		
		book.removeSubscriber(subscriber);
		book.printNames();
		System.out.println("----------------------------");
		book.printTelephones();
		System.out.println("----------------------------");
		book.printSubscriber();

	}

}
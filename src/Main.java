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

		book.printNames();
		System.out.println("----------------------------");
		book.printTelephones();
		System.out.println("----------------------------");
		book.printSubscriber();

	}

}
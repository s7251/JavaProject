public class Main {
	public static void main(String[] args) {

	  	Book book = new Book();
		book.addName("Jan", "Kowalski");
		book.addName("Krystian", "Kulas");
		
		book.addTelephone("999123123");
		book.addTelephone("123123123");
		
		book.printNames();
		System.out.println("***********************************");
		book.printTelephones();
	}

}

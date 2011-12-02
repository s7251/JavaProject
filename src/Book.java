import java.util.ArrayList;
import java.util.List;

public class Book {

	private List<Subscriber> subscribers = new ArrayList<Subscriber>();

	public void addSubscriber(Subscriber subscriber) {
		subscribers.add(subscriber);
	}

	public void printNames() {
		System.out.println("Names:");
		for (Subscriber subscriber : subscribers) {
			subscriber.getName().printName();
		}
	}

	public void printTelephones() {
		System.out.println("Telephones:");
		for (Subscriber subscriber : subscribers) {
			subscriber.getTelephone().printTelephone();
		}
	}

	public void printSubscriber() {
		System.out.println("Subscribers:");
		for (Subscriber subscriber : subscribers) {
			Name name = subscriber.getName();
			Telephone telephone = subscriber.getTelephone();

			System.out.println(name.getFirstname() + " " + name.getSurname()
					+ " - " + telephone.getTelephone());
		}
	}
}

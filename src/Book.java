import java.util.ArrayList;
import java.util.List;

public class Book {

	private List<Subscriber> subscribers = new ArrayList<Subscriber>();

	public void addSubscriber(Subscriber subscriber) {
		subscribers.add(subscriber);
	}

	public void removeSubscriber(Subscriber subscriber) {
		subscribers.remove(searchSubscriber(subscriber));
	}

	public Subscriber searchSubscriber(Subscriber subscriber) {
		
		String firstname = subscriber.getName().getFirstname();
		String surname = subscriber.getName().getSurname();
		String telephone = subscriber.getTelephone().getTelephone();
		
		for (Subscriber sub : subscribers) {
			if (firstname.equals(sub.getName().getFirstname()) && surname.equals(sub.getName().getSurname()) && telephone.equals(sub.getTelephone().getTelephone()) )
				return sub;
		}
		return null;
	}

	public void printNames() {
		System.out.println("Names:");
		for (Subscriber sub : subscribers) {
			sub.getName().printName();
		}
	}

	public void printTelephones() {
		System.out.println("Telephones:");
		for (Subscriber sub : subscribers) {
			sub.getTelephone().printTelephone();
		}
	}

	public void printSubscriber() {
		System.out.println("Subscribers:");
		for (Subscriber sub : subscribers) {
			Name name = sub.getName();
			Telephone telephone = sub.getTelephone();

			System.out.println(name.getFirstname() + " " + name.getSurname()
					+ " - " + telephone.getTelephone());
		}
	}
}

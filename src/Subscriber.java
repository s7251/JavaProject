
public class Subscriber {
    private Name name;
    private Telephone telephone;
    
    public Subscriber(Name name, Telephone telephone) {
        this.name = name;
        this.telephone = telephone;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Telephone getTelephone() {
        return telephone;
    }

    public void setTelephone(Telephone telephone) {
        this.telephone = telephone;
    }
}

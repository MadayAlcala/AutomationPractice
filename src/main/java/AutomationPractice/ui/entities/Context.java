package AutomationPractice.ui.entities;

/**
 * Context class.
 *
 * @author Maday Alcala
 * @version 0.0.1
 */
public class Context {
    private Address address;

    /**
     * Constructor class.
     */
    public Context() {
        this.address = new Address();
    }


    /**
     * Metod return the class address.
     * @return address class.
     */
    public Address getAddress() {
        return address;
    }
}

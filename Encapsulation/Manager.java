public class Manager {
	private String name;
	
    Manager(String name) {
        this.name = name;
    }


    void takeFeedback( Customer customer) {
        if (customer.getFeedback() > 0)
            System.out.println(name + " says: " + customer.getCustomerName() + " was happy with their stay!");
        else if (customer.getFeedback() < 0)
            System.out.println(name + " says: " + customer.getCustomerName() + " was unhappy with their stay!");
        else
            System.out.println(name + " says: " + customer.getCustomerName() + " found their stay ok.");
    }


}
public class Receptionist {
    private String name;
    private String new_receptionistName;
    
	Receptionist(String name) {
        this.name = name;
	}


    void checkIn(Hotel hotel, Customer customer) {
        //addOccupant(hotel.get(customer.getRoomBooking() - 1), customer);
        hotel.get(customer.getRoomBooking() - 1).addOccupant(customer);

        System.out.println(name + " checked in " + customer.getCustomerName());
    }

    void checkOut(Hotel hotel, Customer customer, Manager manager) {
        //removeOccupant(hotel.get(customer.getRoomBooking() - 1), customer);
        hotel.get(customer.getRoomBooking() - 1).removeOccupant(customer);
        System.out.println(name + " checked out " + customer.getCustomerName());
        manager.takeFeedback(customer);
    }



}
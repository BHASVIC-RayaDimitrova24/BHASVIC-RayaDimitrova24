public class Customer {
	private int roomBooking;
	private String name;
	private int feedback;

	
    Customer(int roomBooking, String name) {
        this.roomBooking = roomBooking;
        this.name = name;
        this.feedback = 0;
    }

    public void positiveFeedback(){
        this.feedback++;
    }

    public void negativeFeedback(){
        this.feedback--;
    }

    public int getFeedback(){
        return this.feedback;
    }

    public String getCustomerName() {
        return name;
    }

    public int getRoomBooking() {
        return roomBooking;
    }

}
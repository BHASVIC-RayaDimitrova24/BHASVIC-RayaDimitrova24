import java.util.ArrayList;

public class Room {
	private int number;
	private int size;
	private ArrayList<Customer> occupants;
	boolean clean;
	
    Room(int number, int size, boolean clean) {
        this.number = number;
        this.size = size;
        this.occupants = new ArrayList<Customer>();
        this.clean = clean;
    }

    void addOccupant( Customer occupantIn) {
        if (occupants.size() < size) {
            occupants.add(occupantIn);
            occupantIn.positiveFeedback();
        }
        else {
            occupantIn.negativeFeedback();
            return;
        }
        if (clean == true)
            occupantIn.positiveFeedback();
        else
            occupantIn.negativeFeedback();
        clean = false;
    }

    void removeOccupant(Customer occupantOut) {
        int index = -1;
        for (int i = 0; i < occupants.size(); i++) {
            if (occupants.get(i).equals(occupantOut))
                index = i;
        }
        if (index != -1)
            occupants.remove(index);
    }

    public int getRoomNumber() {
        return number;
    }

    public boolean getClean(){
        return clean;
    }

    public ArrayList<Customer> getOccupants() {
        return occupants;
    }

}
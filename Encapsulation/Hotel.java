import java.util.ArrayList;

public class Hotel {
	private ArrayList<Room> rooms;
    private int number;
	
    Hotel(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public ArrayList <Room> getRooms(){
        return rooms;
    }

    public int size(){
        return rooms.size();
    }

    public Room get(int number){
        return rooms.get(number);
    }



}
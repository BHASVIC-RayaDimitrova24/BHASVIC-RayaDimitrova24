import java.util.ArrayList;
public class Cleaner {
	private String name;


    Cleaner(String name) {
        this.name = name;
    }


    void cleanRooms(Hotel hotel) {
        for (int i = 0; i < hotel.size(); i++) {
            if (hotel.get(i).getOccupants().isEmpty()) {

                hotel.get(i).clean = true;
                System.out.println(name + " cleaned Room " + hotel.get(i).getRoomNumber());
            }
        }
    }
}
import java.util.ArrayList;
/**
 * Write a description of class Map here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Map
{
    // instance variables - replace the example below with your own
    private ArrayList<Room> rooms; 

    /**
     * Constructor for objects of class Map
     */
    public Map()
    {
        // initialise instance variables
        rooms = new ArrayList<>();
        
        Room r = new Room(0, "Inn", "You are in the Inn");
        rooms.add(r);
        r.setExit("Door", 4);
        
        r = new Room(1, "Shop", "You are in a a dusty old shop");
        rooms.add(r);
        r.setItem("Sword", "Two handed sharp sword");
        r.setExit("Door", 4);
        
        r = new Room(2, "Bank", "You have now entered the bank");
        rooms.add(r);
        r.setExit("Door", 5);
        r.setItem("Money", "You have gained some money");
        
        r = new Room(3, "Safehouse", "You have now arrived at the safehouse");
        rooms.add(r);
        r.setExit("Door", 5);
        
        r = new Room(4, "West end", "You at the west end of the street");
        rooms.add(r);
        r.setExit("North", 0);
        r.setExit("South", 1);
        r.setExit("East", 5);
        
        r = new Room(5, "East end", "You at the east end of the street");
        rooms.add(r);
        r.setExit("North", 3);
        r.setExit("South", 2);
        r.setExit("West", 4);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void printMap()
    {
        for(Room r:rooms){
            System.out.println("###");
            System.out.println(r.getName());
            System.out.println(r.getDescription());
            System.out.println("With exits");
            r.printExits();
        }
    }
    
    public Room startingRoom(){
        return rooms.get(3);
    }
    
    public Room getRoom(int id)
    {
        return rooms.get(id);
    }
}

import java.util.ArrayList;
/**
 * Write a description of class Map here.
 *
 * @author (Mohammed Ahmed)
 * @version (11/11/2020)
 */
public class Map
{
  private ArrayList<Room> rooms; 

    /**
     * Constructor for objects of class Map
     * This is the rooms array list where i have added a map with all the
       rooms and items that need to be added. There are a total of 12 rooms.
     */
    public Map()
    {
        // initialise instance variables
        rooms = new ArrayList<>();
        
        Room r = new Room(0, "Inn", "You are in the Inn");
        rooms.add(r);
        r.setItem("Food", "You have gained a sack of food");
        r.setExit("Door", 4);
        
        r = new Room(1, "Shop", "You are in a a dusty old shop");
        rooms.add(r);
        r.setItem("Sword", "Two handed sharp sword");
        r.setItem("Sheild", "You have gained a round sheild");
        r.setExit("Door", 4);
        
        r = new Room(2, "Bank", "You have now entered the bank");
        rooms.add(r);
        r.setExit("Door", 5);
        r.setItem("Money", "You have gained some money");
        
        r = new Room(3, "Safehouse", "You have now arrived at the safehouse");
        rooms.add(r);
        r.setItem("Hidden blade", "You have equipped a hidden blade");
        r.setExit("Door", 5);
        
        r = new Room(4, "West end", "You at the west end of the street");
        rooms.add(r);
        r.setExit("North", 0);
        r.setExit("South", 1);
        r.setExit("East", 5);
        r.setExit("West", 7);
        r.setExit("East", 9);
        r.setExit("East", 8);
        
        r = new Room(5, "East end", "You at the east end of the street");
        rooms.add(r);
        r.setExit("North", 3);
        r.setExit("South", 2);
        r.setExit("West", 4);
        r.setExit("East", 10);
        r.setExit("East", 6);
        r.setExit("South", 11);
        
        r = new Room(6, "City Hall", "You have now entered City hall");
        rooms.add(r);
        
        r = new Room(7, "Castle", "You have entered the castle");
        rooms.add(r);
        
        r = new Room(8, "Barracks", "You have now entered the barracks");
        rooms.add(r);
        
        r = new Room(9, "City centre", "You have now entred the city centre");
        rooms.add(r);
        
        r = new Room(10, "Woods", "You have now entered the woods");
        rooms.add(r);
        
        r = new Room(11, "Caves", "You have now entered the caves");
        rooms.add(r);
    }

    /**
     * An example of a method - replace this comment with your own
     * Added a public void and a for loop for printing out the rooms and 
       giving the name and the descrption of the items and rooms and also
       i added 2 public rooms for the starting point.
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

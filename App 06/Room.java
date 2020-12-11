import java.util.ArrayList;
/**
 * Write a description of class Room here.
 *
 * @author (Mohammed Ahmed)
 * @version (11/11/2020)
 */
public class Room
{
    // instance variables - replace the example below with your own
    private String description;
    private String name;
    private int id;
    private ArrayList<Exit> exits;
    private ArrayList<Item> items;

    /**
     * Constructor for objects of class Room
     */
    public Room(int i, String n, String d)
    {
        // initialise instance variables
        description = d;
        name = n;
        id = i;
        exits = new ArrayList<>();
        items = new ArrayList<>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public void setExit(String direction, int id)
    {
        Exit e = new Exit(id, direction);
        exits.add(e);
    }
    
    public int getExit(String d)
    {
        for(Exit e:exits){
            if (e.getDirection().contains(d)){
                return e.getId();
            }
        }
        return -1;
    }
    
    public void printExits()
    {
        for (Exit e:exits){
            System.out.println(e.getDirection());
        }
            
    }
    
    public void setItem(String name, String description)
    {
        Item i = new Item(name, description);
        items.add(i);
    }
    
    public Item takeItem(String name)
    {
        for(Item i:items){
            if (i.getName().contains(name)){
                items.remove(i);
                return i;
            }
        }
        return null;
    }
    
    public void printItems()
    {
        for (Item i:items){
            i.printItem();
        }
            
    }
    
    public void printRoom()
    {
        System.out.println("You are in " + this.name);
        System.out.println(this.description);
        System.out.println("There are exits:");
        this.printExits();
        System.out.println("You can see:");
        this.printItems();
    }
    }

    


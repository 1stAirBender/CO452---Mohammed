import java.util.ArrayList;
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player
{
    // instance variables - replace the example below with your own
    private int score;
    private int energy;
    private String name;
    private ArrayList<Item> items;
   

    /**
     * Constructor for objects of class Player
     */
    public Player(String Name)
    {
        // initialise instance variables
        score = 0;
        energy = 100;
        this.name = Name;
        items = new ArrayList<>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getScore()
    {
        // put your code here
        return score;
    }
    
    public int getEnergy()
    {
        // put your code here
        return energy;
    }
    
    public String getName()
    {
        // put your code here
        return name;
    }
    
    public int changeEnergy(int e)
    {
        energy = energy + e;
        return energy;
    }
    
    public int changeScore(int s)
    {
        energy = score + s;
        return score;
    }
    
    public Item removeItem(String name)
    {
        for(Item i:items){
            if (i.getName().contains(name)){
                items.remove(i);
                return i;
            }
        }
        return null;
    }
    
    public void addItem(Item i)
    {
        items.add(i);
    }
    
    public boolean hasItem(String name)
    {
        for(Item i:items){
            if (i.getName().contains(name)){
                return true;
            }
        }
        
        return false;
    }
    
    public void printItems()
    {
        for (Item i:items){
            i.printItem();
        }
    }
}

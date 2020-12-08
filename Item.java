
/**
 * Write a description of class Item here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Item
{
    // instance variables - replace the example below with your own
    private String name;
    private String description;

    /**
     * Constructor for objects of class Item
     */
    public Item(String n, String d)
    {
        // initialise instance variables
        name = n;
        description = d;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getName()
    {
        // put your code here
        return name;
    }
    
    public String getDescription()
    {
        // put your code here
        return description;
    }
    
    public void printItem()
    {
        System.out.println(name +": "+  description);
        
    }
}


/**
 * Write a description of class Course here.
 *
 * @author (Mohammed Ahmed)
 * @version (6/10/2020)
 */
public class Course
{
    // instance variables - replace the example below with your own
    private String codeNumber;
    private String title;

    /**
     * Constructor for objects of class Course
     */
    public Course(String codeNumber, String title)
    {
        this.codeNumber = codeNumber;
        this.title = title;
       
    }
    
    public void print()
    {
        System.out.println("Code number is: " + codeNumber + 
        " and course tile: " + title);
        
    }
    
  

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void sampleMethod()
    {
        // put your code here
         
    }
}
